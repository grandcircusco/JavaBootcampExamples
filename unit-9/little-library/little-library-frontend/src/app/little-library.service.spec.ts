import { TestBed } from '@angular/core/testing';

import { LittleLibraryService } from './little-library.service';

describe('LittleLibraryService', () => {
  let service: LittleLibraryService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LittleLibraryService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
