import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import SearchParams from 'src/app/interfaces/SearchParams';

@Component({
  selector: 'app-search-books-form',
  templateUrl: './search-books-form.component.html',
  styleUrls: ['./search-books-form.component.css'],
})
export class SearchBooksFormComponent implements OnInit {
  @Output() searchLibrary = new EventEmitter<SearchParams>();

  query: string = '';
  lentOut: string = 'null';

  constructor() {}

  ngOnInit(): void {}

  search = (): void => {
    let status: boolean | null =
      this.lentOut === 'true' ? true : this.lentOut === 'false' ? false : null;
    this.searchLibrary.emit({ keyword: this.query, holdStatus: status });
  };

  clear = (): void => {
    this.query = '';
    this.lentOut = 'null';
  };
}
