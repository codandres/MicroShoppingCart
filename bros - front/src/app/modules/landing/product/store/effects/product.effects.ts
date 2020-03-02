import { Injectable } from '@angular/core';
import { Actions, createEffect, ofType } from '@ngrx/effects';

import { of } from 'rxjs';
import { map, catchError, exhaustMap } from 'rxjs/operators';
import { getProducts, getProductsSuccess, getProductsFailure, saveProduct, saveProductSuccess, saveProductFailure, getProductById, getProductByIdFailure } from '../actions/product.actions';
import { ProductService } from '../../services/product.service';
import { Product } from 'src/app/shared/models/product.model';

@Injectable()
export class ProductEffects {

    loadProducts$ = createEffect(() =>
        this.actions$.pipe(
            ofType(getProducts),
            exhaustMap(() =>
                this._productService.getProducts().pipe(
                    map((products: Product[]) => getProductsSuccess({ products })),
                    catchError((error: any) => of(getProductsFailure({ error })))
                )
            )
        )
    );

    getProductById$ = createEffect(() =>
        this.actions$.pipe(
            ofType(getProductById),
            exhaustMap((action) =>
                this._productService.getProductById(action.id).pipe(
                    map((products: Product[]) => getProductsSuccess({ products })),
                    catchError((error: any) => of(getProductByIdFailure({ error })))
                )
            )
        )
    );

    saveProduct$ = createEffect(() =>
        this.actions$.pipe(
            ofType(saveProduct),
            exhaustMap((action) =>
                this._productService.saveProduct(action.product).pipe(
                    map((product: Product) => saveProductSuccess({ product })),
                    catchError((error: any) => of(saveProductFailure({ error })))
                )
            )
        )
    );


    constructor(private actions$: Actions,
        private _productService: ProductService) {
    }

}
