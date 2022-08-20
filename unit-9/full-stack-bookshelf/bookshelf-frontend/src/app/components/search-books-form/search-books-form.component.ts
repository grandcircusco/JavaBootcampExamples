import { Component, EventEmitter, OnInit, Output } from "@angular/core";
import SearchParams from "src/app/interfaces/SearchParams";

@Component({
  selector: "app-search-books-form",
  templateUrl: "./search-books-form.component.html",
  styleUrls: ["./search-books-form.component.css"],
})
export class SearchBooksFormComponent implements OnInit {
  @Output() searchBookshelf = new EventEmitter<SearchParams>();

  query: string = "";
  lentOut: string = "null";

  constructor() {}

  ngOnInit(): void {}

  search = (): void => {
    // lentOut is a string and we have to convert it to boolean | null
    let status: boolean | null;
    if (this.lentOut === "true") {
      status = true;
    } else if (this.lentOut === "false") {
      status = false;
    } else {
      status = null;
    }

    this.searchBookshelf.emit({ query: this.query, lentOut: status });
  };

  clear = (): void => {
    this.query = "";
    this.lentOut = "null";
  };
}
