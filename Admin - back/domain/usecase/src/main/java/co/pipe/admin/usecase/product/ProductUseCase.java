package co.pipe.admin.usecase.product;

import co.pipe.admin.model.product.Product;
import co.pipe.admin.model.product.gateways.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;


@RequiredArgsConstructor
public class ProductUseCase {
    private final ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        return repository.findById(id);
    }

    public Product save(Product product) {
        return repository.save(product);
    }

}
