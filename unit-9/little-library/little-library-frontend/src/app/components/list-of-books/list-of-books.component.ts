import { Component, OnInit } from '@angular/core';
import Book from 'src/app/interfaces/Book';
import SearchParams from 'src/app/interfaces/SearchParams';
import { LittleLibraryService } from 'src/app/little-library.service';

@Component({
  selector: 'app-list-of-books',
  templateUrl: './list-of-books.component.html',
  styleUrls: ['./list-of-books.component.css'],
})
export class ListOfBooksComponent implements OnInit {
  books: Book[] = [];
  searchStatus: boolean = false;
  constructor(private libraryService: LittleLibraryService) {}

  ngOnInit(): void {
    this.setBooks();
  }

  setBooks = (): void => {
    this.libraryService.getBooks().subscribe((data: Book[]) => {
      this.books = data;
    });
  };

  searchLibrary = (searchParams: SearchParams): void => {
    this.libraryService
      .searchBooks(searchParams.keyword, searchParams.holdStatus)
      .subscribe((data: Book[]) => {
        this.books = data;
      });
  };

  updateLentOut = (book: Book): void => {
    const updatedBook = { ...book };
    updatedBook.lentOut = !book.lentOut;
    this.libraryService
      .updateBook(book.id!, updatedBook)
      .subscribe(() => this.setBooks());
  };

  addBookToLibrary = (book: Book): void => {
    this.libraryService.addBook(book).subscribe(() => this.setBooks());
  };

  removeBookFromLibrary = (id: number): void => {
    this.libraryService.deleteBook(id).subscribe(() => this.setBooks());
  };

  setSearchStatus = (status: boolean): void => {
    this.searchStatus = status;
    if (!status) {
      this.setBooks();
    }
  };
}
