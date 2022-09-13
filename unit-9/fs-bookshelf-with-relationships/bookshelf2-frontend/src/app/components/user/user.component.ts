import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import Book from 'src/app/interfaces/Book';
import { User } from 'src/app/interfaces/User';
import { BookService } from 'src/app/services/book.service';
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

  constructor(private userService: UserService, private bookService: BookService, private route:ActivatedRoute) { }

  ngOnInit(): void {
    this.route.params.subscribe((params) => {
      const userId = parseInt(params['id']);
      this.userService.getUserById(userId).subscribe(user => {
        this.user = user;
      });
      this.bookService.getBooksByOwner(userId).subscribe(books => {
        this.books = books;
      });
      this.bookService.getBooksByLentTo(userId).subscribe(books => {
        this.borrowedBooks = books;
      });
    });
  }

}
