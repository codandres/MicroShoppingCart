import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from '../../../../shared/models/product.model';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  httpHeaders: HttpHeaders;
  apiUrl: string = environment.apiUrl;


  constructor(private readonly http: HttpClient) {
    this.httpHeaders = new HttpHeaders({
      'Content-Type': 'application/json',
    });
  }

  getProducts(): Observable<Product[]> {
    return this.http.get<Product[]>(`${this.apiUrl}/product`);
  }

  getProductById(id: number): Observable<Product[]> {
    return this.http.get<Product[]>(`${this.apiUrl}/product/${id}`);
  }

  saveProduct(product: Product): Observable<Product> {
    return this.http.post<Product>(`${this.apiUrl}/product`, product);
  }

  updateProduct(product: Product): Observable<Product> {
    return this.http.put<Product>(`${this.apiUrl}/product/${product.id}`, product);
  }

  deleteProduct(id: number): void {
    this.http.delete<Product>(`${this.apiUrl}/product/${id}`);
  }

}
