import { Component, EventEmitter, Input, OnInit, Output } from "@angular/core";
import Book from "src/app/interfaces/Book";
import { User } from "src/app/interfaces/User";
import { AuthService } from "src/app/services/auth.service";
import { UserService } from "src/app/services/user.service";

@Component({
  selector: "app-book",
  templateUrl: "./book.component.html",
  styleUrls: ["./book.component.css"],
})
export class BookComponent implements OnInit {
  @Input() book: Book | undefined;
  @Input() showActions: boolean = false;
  @Output() updateBook = new EventEmitter<Book>();
  @Output() removeBookFromShelf = new EventEmitter<number>();
  updating: boolean = false;
  formLentToId: string = "";
  lendableUsers: User[] = [];

  constructor(private userService:UserService, private authService: AuthService) {}

  ngOnInit(): void {}

  toggleLentOut = (): void => {
    if (this.book?.lentOut) {
      const updatedBook = { ...this.book, lentOut: false, lentOutTo: null };
      this.updateBook.emit(updatedBook);
    } else {
      this.updating = true;
      this.userService.getAllUsers().subscribe((allUsers) => {
        this.lendableUsers = allUsers.filter(user => user.id !== this.authService.getLoggedInUserId());
      });
    }
  };

  saveUpdate = ():void => {
    const selectedUserId = parseInt(this.formLentToId);
    let selectedUser: User | null = null;
    if (selectedUserId) {
      selectedUser = {
        id: selectedUserId,
        username: "", // It's okay to use dummy data here, only the id matters when saving to API.
        displayName: ""
      };
    }
    // NOTE: An alternative would be to find the actual user object based on the id.
    // const selectedUser = this.lendableUsers.find(user => user.id === selectedUserId);
    
    const updatedBook: Book = { ...this.book!, lentOut: true, lentOutTo: selectedUser ?? null };
    this.updateBook.emit(updatedBook);
  }

  cancelUpdate = ():void => {
    this.updating = false;
  }

  remove = (): void => {
    this.removeBookFromShelf.emit(this.book?.id);
  };
}
