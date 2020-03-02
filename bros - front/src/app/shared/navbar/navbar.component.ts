import { Component, OnInit } from '@angular/core';
import { Store } from '@ngrx/store';
import { ProductState } from 'src/app/modules/landing/product/store/reducers/product.reducer';
import { NgbModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { CheckoutComponent } from 'src/app/modules/payment/checkout/checkout.component';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent implements OnInit {

  showAlert: boolean = false;

  constructor(private modal: NgbModal) { }

  ngOnInit(): void {

  }

  goToCart() {

    const checkoutModal: NgbModalRef = this.modal.open(CheckoutComponent);
    // checkoutModal.componentInstance.products = [productToCheckout];
    checkoutModal.result.then((saved: any) => {
      console.log('el obj:::: ', saved);
      this.showAlert = saved;
    }).then(() => setTimeout(() => {
      this.showAlert = false;
    }, 400000));
  }

}
