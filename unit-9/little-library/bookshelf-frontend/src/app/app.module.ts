import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { ListOfBooksComponent } from './components/list-of-books/list-of-books.component';
import { BookComponent } from './components/book/book.component';
import { AddBookFormComponent } from './components/add-book-form/add-book-form.component';
import { SearchBooksFormComponent } from './components/search-books-form/search-books-form.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    ListOfBooksComponent,
    BookComponent,
    AddBookFormComponent,
    SearchBooksFormComponent,
  ],
  imports: [BrowserModule, HttpClientModule, FormsModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
