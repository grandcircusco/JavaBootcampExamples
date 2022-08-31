import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import Book from "./interfaces/Book";

@Injectable({
  providedIn: "root",
})
export class BookshelfService {
  // The base URL points to our Java Spring Boot backend on port 8080.
  baseURL: string = "http://localhost:8080/books";

  constructor(private http: HttpClient) {}

  getAllBooks(): Observable<Book[]> {
    return this.http.get<Book[]>(`${this.baseURL}`);
  };
  searchBooks(
    query: string,
    lentOut: boolean | null
  ): Observable<Book[]> {
    // Add URL query parameters to an object. HttpClient will add them to the URL safely.
    const params: any = {};
    if (query) {
      params.q = query;
    }
    if (lentOut !== null) {
      params.lentOut = lentOut;
    }
    return this.http.get<Book[]>(`${this.baseURL}`, {
      params,
    });
  };
  // Get by ID is not used in this application, but it's included here as an example
  getBookById(id: number): Observable<Book> {
    return this.http.get<Book>(`${this.baseURL}/${id}`);
  }
  // Use the various HTTP methods as needed.
  // All of these still return an observable. We must subscribe in the component in
  // order to trigger the actual API call.
  updateBook(updatedBook: Book): Observable<Book> {
    // For PUT, pass the body data as a second parameter after the URL
    return this.http.put<Book>(`${this.baseURL}/${updatedBook.id}`, updatedBook);
  };
  addBook(newBook: Book): Observable<Book> {
    // For POST, pass the body data as a second parameter after the URL
    return this.http.post<Book>(`${this.baseURL}`, newBook);
  };
  deleteBook(id: number): Observable<void> {
    return this.http.delete<void>(`${this.baseURL}/${id}`);
  };
}
