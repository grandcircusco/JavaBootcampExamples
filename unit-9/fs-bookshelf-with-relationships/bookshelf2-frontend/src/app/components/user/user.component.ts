import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import Book from 'src/app/interfaces/Book';
import { User } from 'src/app/interfaces/User';
import { BookshelfService } from 'src/app/services/bookshelf.service';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  user: User = {
    username: "",
    displayName: ""
  };
  books: Book[] = [];
  borrowedBooks: Book[] = [];

  constructor(private userService: UserService, private bookshelfService: BookshelfService, private route:ActivatedRoute) { }

  ngOnInit(): void {
    this.route.params.subscribe((params) => {
      const userId = parseInt(params['id']);
      this.userService.getUserById(userId).subscribe(user => {
        this.user = user;
      });
      this.bookshelfService.getBooksByOwner(userId).subscribe(books => {
        this.books = books;
      });
      this.bookshelfService.getBooksByLentTo(userId).subscribe(books => {
        this.borrowedBooks = books;
      });
    });
  }

}
