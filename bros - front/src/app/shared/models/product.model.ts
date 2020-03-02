import { Provider } from './provider.model';

export class Product {
    id: number;
    name: string;
    detail: string;
    quantity: number = Math.random();
    // price: number = 50.25;
    imgUrl: string;
    price = 15;
    idsProvider: Provider[];
}

// export class Product {
//     id: number;
//     date: Date;
//     paid: boolean;
//     userId: boolean;

// }