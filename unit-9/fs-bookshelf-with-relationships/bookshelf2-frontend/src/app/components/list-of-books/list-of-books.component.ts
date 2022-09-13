import { Component, OnInit } from "@angular/core";
import Book from "src/app/interfaces/Book";
import SearchParams from "src/app/interfaces/SearchParams";
import { AuthService } from "src/app/services/auth.service";
import { BookService } from "src/app/services/book.service";
import { Router } from '@angular/router';

@Component({
  selector: "app-list-of-books",
  templateUrl: "./list-of-books.component.html",
  styleUrls: ["./list-of-books.component.css"],
})
export class ListOfBooksComponent implements OnInit {
  books: Book[] = [];
  filters: SearchParams = { query: "", lentOut: null}
  constructor(private bookService: BookService, private authService: AuthService, private router: Router) {}

  ngOnInit(): void {
    if (this.authService.getLoggedInUserId() === null) {
      this.router.navigateByUrl("/login");
    }
    this.loadBooks();
  }

  loadBooks(): void {
    if (this.hasFilters()) {
      this.bookService
      .searchBooks(this.authService.getLoggedInUserId()!, this.filters.query, this.filters.lentOut)
      .subscribe((data: Book[]) => {
        this.books = data;
      });
    } else {
      this.bookService.getBooksByOwner(this.authService.getLoggedInUserId()!).subscribe((data: Book[]) => {
        this.books = data;
      });
    }
  };

  hasFilters(): boolean {
    return this.filters.query !== "" || this.filters.lentOut !== null;
  }

  setFilters(params: SearchParams) {
    this.filters = params;
    this.loadBooks();
  }

  clearFilters(): void {
    this.setFilters({
      query: "",
      lentOut: null
    });
  }

  updateLentOut(updatedBook: Book): void {
     this.bookService
      .updateBook(updatedBook)
      .subscribe(() => this.loadBooks());
  };

  addBookToShelf(book: Book): void {
    this.bookService.addBook(book).subscribe(() => this.loadBooks());
  };

  removeBookFromShelf(id: number): void {
    this.bookService.deleteBook(id).subscribe(() => this.loadBooks());
  };
}
