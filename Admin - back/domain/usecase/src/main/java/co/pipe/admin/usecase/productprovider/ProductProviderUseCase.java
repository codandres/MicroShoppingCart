package co.pipe.admin.usecase.productprovider;

import co.pipe.admin.model.product.Product;
import co.pipe.admin.model.productprovider.ProductProvider;
import co.pipe.admin.model.productprovider.gateways.ProductProviderRepository;
import co.pipe.admin.model.provider.Provider;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ProductProviderUseCase {
    private final ProductProviderRepository repository;

    public List<ProductProvider> findAll() {
        return repository.findAll();
    }

    public ProductProvider findById(Product idProduct, Provider idProvider) {
        return repository.findById(idProduct, idProvider);
    }

    public ProductProvider save(ProductProvider productProvider) {
        return repository.save(productProvider);
    }

}
