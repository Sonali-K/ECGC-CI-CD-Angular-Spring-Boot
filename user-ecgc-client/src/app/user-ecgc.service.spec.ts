import { TestBed } from '@angular/core/testing';

import { UserEcgcService } from './user-ecgc.service';

describe('UserEcgcService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: UserEcgcService = TestBed.get(UserEcgcService);
    expect(service).toBeTruthy();
  });
});
