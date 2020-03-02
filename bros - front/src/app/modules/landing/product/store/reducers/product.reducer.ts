import { Action, createReducer, on, createSelector } from '@ngrx/store';
import { getProductsSuccess, getProductsFailure, getProductByIdSuccess, saveProductSuccess, getProductByIdFailure, saveProductFailure, resetProduct, resetProducts, resetErrorResponse, resetSavedProduct, addProductToCart, deleteProductToCart, loadCartProducts, resetCart } from '../actions/product.actions';
import { Product } from 'src/app/shared/models/product.model';
import { AppStore } from 'src/app/store';

export interface ProductState {
    products: Product[];
    chosenProduct: Product;
    product: Product;
    savedProduct: Product;
    errorResponse: any;
    shoppingCart: Product[];
}

export const initialState: ProductState = {
    products: undefined,
    chosenProduct: undefined,
    product: undefined,
    savedProduct: undefined,
    errorResponse: undefined,
    shoppingCart: []
};

const _productReducer = createReducer(
    initialState,
    on(getProductsSuccess, (state: ProductState, { products }) => ({ ...state, products })),
    on(getProductsFailure, (state: ProductState, { error }) => ({ ...state, errorResponse: error })),
    on(getProductByIdSuccess, (state: ProductState, { product }) => ({ ...state, product })),
    on(getProductByIdFailure, (state: ProductState, { error }) => ({ ...state, errorResponse: error })),
    on(saveProductSuccess, (state: ProductState, { product }) => ({ ...state, savedProduct: product })),
    on(saveProductFailure, (state: ProductState, { error }) => ({ ...state, errorResponse: error })),
    on(resetProducts, (state: ProductState) => ({ ...state, products: initialState.products })),
    on(resetProduct, (state: ProductState) => ({ ...state, product: initialState.chosenProduct })),
    on(resetSavedProduct, (state: ProductState) => ({ ...state, product: initialState.chosenProduct })),
    on(resetErrorResponse, (state: ProductState) => ({ ...state, product: initialState.errorResponse })),
    on(addProductToCart, (state: ProductState, { product }) => ({ ...state, shoppingCart: [...state.shoppingCart, product] })),
    on(deleteProductToCart, (state: ProductState, { id }) => ({ ...state, shoppingCart: state.shoppingCart.filter(prod => prod.id !== id) })),
    on(resetCart, (state: ProductState) => ({ ...state, shoppingCart: initialState.shoppingCart })),
);

export function productReducer(state: ProductState | undefined, action: Action) {
    return _productReducer(state, action);
}

export const selectProductState = (state: AppStore): ProductState => state.product;

export const selectProducts = createSelector(
    selectProductState,
    (state: ProductState) => state.products
);

export const selectChosenProduct = createSelector(
    selectProductState,
    (state: ProductState) => state.chosenProduct
);

export const selectProduct = createSelector(
    selectProductState,
    (state: ProductState) => state.product
);

export const selectErrorResponse = createSelector(
    selectProductState,
    (state: ProductState) => state.errorResponse
);


export const selectCartProducts = createSelector(
    selectProductState,
    (state: ProductState) => state.shoppingCart
);