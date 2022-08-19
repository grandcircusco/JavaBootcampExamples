import { Component, EventEmitter, Input, OnInit, Output } from "@angular/core";
import Book from "src/app/interfaces/Book";

@Component({
  selector: "app-book",
  templateUrl: "./book.component.html",
  styleUrls: ["./book.component.css"],
})
export class BookComponent implements OnInit {
  @Input() book: Book | undefined;
  @Output() update = new EventEmitter<Book>();
  @Output() removeBookFromShelf = new EventEmitter<number>();

  constructor() {}

  ngOnInit(): void {}

  updateBook = (): void => {
    this.update.emit(this.book);
  };

  remove = (): void => {
    this.removeBookFromShelf.emit(this.book?.id);
  };
}
