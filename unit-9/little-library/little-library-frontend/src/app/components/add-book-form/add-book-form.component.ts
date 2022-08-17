import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import Book from 'src/app/interfaces/Book';

@Component({
  selector: 'app-add-book-form',
  templateUrl: './add-book-form.component.html',
  styleUrls: ['./add-book-form.component.css'],
})
export class AddBookFormComponent implements OnInit {
  @Output() addBookToLibrary = new EventEmitter<Book>();

  title: string = '';
  author: string = '';
  pages: string = '';

  constructor() {}

  ngOnInit(): void {}

  add = (): void => {
    this.addBookToLibrary.emit({
      title: this.title,
      author: this.author,
      pages: parseInt(this.pages),
      lentOut: false,
    });
  };
}
