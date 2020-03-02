import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HomeComponent } from './home/home.component';
import { LandingRoutingModule } from './landing-routing.module';
import { NavbarComponent } from 'src/app/shared/navbar/navbar.component';
import { LandingComponent } from './landing.component';
import { ProductComponent } from './product/product.component';
import { ListComponent } from './product/list/list.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { SearchByPipe } from 'src/app/shared/pipes/search-by.pipe';
import { NgxPaginationModule } from 'ngx-pagination';
import { NgbTypeaheadModule, NgbAlertModule, NgbModalModule } from '@ng-bootstrap/ng-bootstrap';
import { CheckoutComponent } from '../payment/checkout/checkout.component';

@NgModule({
  declarations: [
    LandingComponent,
    HomeComponent,
    NavbarComponent,
    ProductComponent,
    ListComponent,
    SearchByPipe,
    CheckoutComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    NgxPaginationModule,
    LandingRoutingModule,
    // EffectsModule.forFeature([ProductEffects]),
    NgbTypeaheadModule,
    NgbAlertModule,

    NgbModalModule
  ],
  entryComponents: [
    CheckoutComponent
  ]
})
export class LandingModule { }
