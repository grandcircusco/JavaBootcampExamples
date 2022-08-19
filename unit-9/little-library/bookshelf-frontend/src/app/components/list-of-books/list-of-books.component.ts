import { Component, OnInit } from "@angular/core";
import Book from "src/app/interfaces/Book";
import SearchParams from "src/app/interfaces/SearchParams";
import { BookshelfService } from "src/app/bookshelf.service";

@Component({
  selector: "app-list-of-books",
  templateUrl: "./list-of-books.component.html",
  styleUrls: ["./list-of-books.component.css"],
})
export class ListOfBooksComponent implements OnInit {
  books: Book[] = [];
  searchStatus: boolean = false;
  constructor(private bookshelfService: BookshelfService) {}

  ngOnInit(): void {
    this.setBooks();
  }

  setBooks = (): void => {
    this.bookshelfService.getBooks().subscribe((data: Book[]) => {
      this.books = data;
      this.searchStatus = false;
    });
  };

  searchBookshelf = (searchParams: SearchParams): void => {
    this.bookshelfService
      .searchBooks(searchParams.keyword, searchParams.holdStatus)
      .subscribe((data: Book[]) => {
        this.books = data;
        this.searchStatus = true;
      });
  };

  updateLentOut = (book: Book): void => {
    const updatedBook = { ...book };
    updatedBook.lentOut = !book.lentOut;
    this.bookshelfService
      .updateBook(book.id!, updatedBook)
      .subscribe(() => this.setBooks());
  };

  addBookToShelf = (book: Book): void => {
    this.bookshelfService.addBook(book).subscribe(() => this.setBooks());
  };

  removeBookFromShelf = (id: number): void => {
    this.bookshelfService.deleteBook(id).subscribe(() => this.setBooks());
  };
}
