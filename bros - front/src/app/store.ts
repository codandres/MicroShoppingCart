
import { productReducer, ProductState } from './modules/landing/product/store/reducers/product.reducer';
import { ActionReducerMap } from '@ngrx/store';


export interface AppStore {
    product: ProductState
}

export const store: ActionReducerMap<AppStore> = {
    product: productReducer
};