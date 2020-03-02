import { Component, OnInit, Input } from '@angular/core';
import { Product } from 'src/app/shared/models/product.model';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { Store, select } from '@ngrx/store';
import { ProductState, selectCartProducts } from '../../landing/product/store/reducers/product.reducer';

@Component({
  selector: 'app-checkout',
  templateUrl: './checkout.component.html',
  styleUrls: ['./checkout.component.scss']
})
export class CheckoutComponent implements OnInit {

  total: number = 0;
  products: Product[];

  constructor(public activeModal: NgbActiveModal, private store: Store<{ product: ProductState }>) { }

  ngOnInit(): void {
    this.getProductsInCart();
    this.products.forEach((p: Product) => this.total += p.price);
    console.log('los productps del carrito: ', this.products);
  }

  getProductsInCart() {
    this.store.pipe(select(selectCartProducts)).subscribe((products: Product[]) => this.products = products)
  }

  buy() {
    this.activeModal.close(true);
  }

}
