import { Component, EventEmitter, OnInit, Output } from "@angular/core";
import Book from "src/app/interfaces/Book";
import { AuthService } from "src/app/services/auth.service";

@Component({
  selector: "app-add-book-form",
  templateUrl: "./add-book-form.component.html",
  styleUrls: ["./add-book-form.component.css"],
})
export class AddBookFormComponent implements OnInit {
  @Output() addBookToShelf = new EventEmitter<Book>();

  title: string = "";
  author: string = "";
  pages: string = "";

  constructor(private authService: AuthService) {}

  ngOnInit(): void {}

  add = (): void => {
    const ownerId = this.authService.getLoggedInUserId();
    if (ownerId === null) {
      alert("Must be logged in to add a book.");
      return;
    }

    this.addBookToShelf.emit({
      title: this.title,
      author: this.author,
      pages: parseInt(this.pages),
      lentOut: false,
      ownerId: ownerId,
      lentOutTo: null
    });
    this.title = "";
    this.author = "";
    this.pages = "";
  };
}
