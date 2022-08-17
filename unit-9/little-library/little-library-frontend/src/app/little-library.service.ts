import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import Book from './interfaces/Book';

@Injectable({
  providedIn: 'root',
})
export class LittleLibraryService {
  baseURL: string = 'http://localhost:8080/books';

  constructor(private http: HttpClient) {}

  getBooks = (): Observable<Book[]> => {
    return this.http.get<Book[]>(`${this.baseURL}`);
  };
  searchBooks = (
    query: string,
    lentOut: boolean | null
  ): Observable<Book[]> => {
    const params: any = {};
    if (query) {
      params.query = query;
    }
    if (lentOut !== null) {
      params.lentOut = lentOut;
    }
    return this.http.get<Book[]>(`${this.baseURL}`, {
      params,
    });
  };
  updateBook = (id: number, updatedBook: Book): Observable<Book> => {
    return this.http.put<Book>(`${this.baseURL}/${id}`, updatedBook);
  };
  addBook = (newBook: Book): Observable<Book> => {
    return this.http.post<Book>(`${this.baseURL}`, newBook);
  };
  deleteBook = (id: number): Observable<void> => {
    return this.http.delete<void>(`${this.baseURL}/${id}`);
  };
}
