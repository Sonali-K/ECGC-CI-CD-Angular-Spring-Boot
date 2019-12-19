import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EcgcComponent } from './ecgc.component';

describe('EcgcComponent', () => {
  let component: EcgcComponent;
  let fixture: ComponentFixture<EcgcComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EcgcComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EcgcComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
