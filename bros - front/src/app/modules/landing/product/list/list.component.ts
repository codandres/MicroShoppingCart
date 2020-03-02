import { Component, OnInit } from '@angular/core';
import { ProductService } from 'src/app/modules/landing/product/services/product.service';
import { Product } from 'src/app/shared/models/product.model';
import { PRODUCTS } from 'src/app/core/mocks/products.mock';
import { NgbModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { CheckoutComponent } from 'src/app/modules/payment/checkout/checkout.component';
import * as _ from 'lodash';
import { Observable } from 'rxjs';
import { debounceTime, distinctUntilChanged, map } from 'rxjs/operators';
import { Store, select } from '@ngrx/store';
import { ProductState, selectProducts } from '../store/reducers/product.reducer';
import { getProducts, getProductById, addProductToCart, deleteProductToCart } from '../store/actions/product.actions';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.scss']
})
export class ListComponent implements OnInit {

  products: Product[];
  quantity: number = 1;
  term: string = "";
  page: number = 4;
  p: number = 1;
  showAlert: boolean = false;

  constructor(private store: Store<{ product: ProductState }>,
    private modalService: NgbModal) { }

  ngOnInit(): void {
    this.getProducts();
  }


  getProducts(): void {
    console.log('ENTRÓÓÓ');
    this.store.dispatch(getProducts());
    this.store.pipe(select(selectProducts)).subscribe(products => {
      console.log('ENtró al selectorrr: ', products);
      this.products = products;
    });
  }

  addToCart(product: Product): void {
    this.store.dispatch(addProductToCart({ product }));
    console.log('Se agregó al carrito el producto: ', product);
  }

  deleteToCart(product: Product): void {
    this.store.dispatch(deleteProductToCart({ id: product.id }));
    console.log('Se eliminó del carrito el producto: ', product);
  }


  goToCheckout() {


    const checkoutModal: NgbModalRef = this.modalService.open(CheckoutComponent);
    // checkoutModal.componentInstance.products = [productToCheckout];
    checkoutModal.result.then((saved: boolean) => {
      this.showAlert = saved;
    }).then(() => setTimeout(() => {
      this.showAlert = false;
    }, 400000));
  }

  search = (text$: Observable<string>) =>
    text$.pipe(
      debounceTime(200),
      distinctUntilChanged(),
      map(term => term.length < 2 ? []
        : this.products.filter((v: Product) => v.name.toLowerCase().indexOf(term.toLowerCase()) > -1)
          .map((v) => `${v.name} - ${v.detail}`).slice(0, 10))
    )

}
