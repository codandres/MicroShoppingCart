import { createAction, props } from '@ngrx/store';
import { Product } from 'src/app/shared/models/product.model';

export const getProducts = createAction(
    '[Product/API] Get Products'
);

export const getProductsSuccess = createAction(
    '[Product/API] Get Products Success',
    props<{ products: Product[] }>()
);

export const getProductsFailure = createAction(
    '[Product/API] Get Products Failure',
    props<{ error: any }>()
);

export const getProductById = createAction(
    '[Product/API] Get Product By Id',
    props<{ id: number }>()
);

export const getProductByIdSuccess = createAction(
    '[Product/API] Get Product By Id Success',
    props<{ product: Product }>()
);

export const getProductByIdFailure = createAction(
    '[Product/API] Get Product By Id Failure',
    props<{ error: any }>()
);

export const saveProduct = createAction(
    '[Product/API] Save Product',
    props<{ product: Product }>()
);

export const saveProductSuccess = createAction(
    '[Product/API] Save Product Success',
    props<{ product: Product }>()
);

export const saveProductFailure = createAction(
    '[Product/API] Save Product Failure',
    props<{ error: any }>()
);

export const updateProduct = createAction(
    '[Product/API] Save Product',
    props<{ product: Product, id: number }>()
);

export const deleteProductById = createAction(
    '[Product/API] Delete Product',
    props<{ id: number }>()
);

export const resetProducts = createAction(
    '[Product] Reset Products'
);

export const resetProduct = createAction(
    '[Product] Reset Product'
);

export const resetSavedProduct = createAction(
    '[Product] Reset Saved Product'
);

export const resetErrorResponse = createAction(
    '[Product] Reset ErrorResponse'
);

export const addProductToCart = createAction(
    '[Product] Add Product to Cart',
    props<{ product: Product }>()
);

export const deleteProductToCart = createAction(
    '[Product] Delete Product to Cart',
    props<{ id: number }>()
);

export const resetCart = createAction(
    '[Product] Reset Cart'
);