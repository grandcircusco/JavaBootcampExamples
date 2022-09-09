import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListOfBooksComponent } from './components/list-of-books/list-of-books.component';
import { BookComponent } from './components/book/book.component';
import { AddBookFormComponent } from './components/add-book-form/add-book-form.component';
import { SearchBooksFormComponent } from './components/search-books-form/search-books-form.component';
import { FormsModule } from '@angular/forms';
import { ListOfUsersComponent } from './components/list-of-users/list-of-users.component';
import { UserComponent } from './components/user/user.component';
import { HeaderComponent } from './components/header/header.component';
import { LoginComponent } from './components/login/login.component';

@NgModule({
  declarations: [
    AppComponent,
    ListOfBooksComponent,
    BookComponent,
    AddBookFormComponent,
    SearchBooksFormComponent,
    ListOfUsersComponent,
    UserComponent,
    HeaderComponent,
    LoginComponent,
  ],
  imports: [BrowserModule, AppRoutingModule, HttpClientModule, FormsModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
