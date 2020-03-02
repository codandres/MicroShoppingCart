package co.pipe.admin.model.product.gateways;


import co.pipe.admin.model.product.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();

    Product findById(Long id);

    Product save(Product product);

    void deleteById(Long id);

    Product update(Product product, Long id);
}
