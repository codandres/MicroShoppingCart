package co.pipe.admin.model.productprovider.gateways;

import co.pipe.admin.model.product.Product;
import co.pipe.admin.model.productprovider.ProductProvider;
import co.pipe.admin.model.provider.Provider;

import java.util.List;

public interface ProductProviderRepository {
    List<ProductProvider> findAll();

    ProductProvider findById(Product idProduct, Provider idProvider);

    ProductProvider save(ProductProvider productProvider);

    void deleteById(Product idProduct, Provider idProvider);

    ProductProvider update(ProductProvider productProvider);

}
