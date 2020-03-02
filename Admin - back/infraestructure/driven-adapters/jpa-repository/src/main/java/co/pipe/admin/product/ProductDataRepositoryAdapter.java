package co.pipe.admin.product;

import co.pipe.admin.jpa.AdapterOperations;
import co.pipe.admin.model.product.Product;
import co.pipe.admin.model.product.gateways.ProductRepository;
import co.pipe.admin.product.mapper.ProductDataMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class ProductDataRepositoryAdapter
        extends AdapterOperations<Product, ProductData, Long, ProductDataMapper, ProductDataRepository>
        implements ProductRepository {

    public ProductDataRepositoryAdapter(ProductDataRepository repository, ProductDataMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Product update(Product product, Long id) {
        final ProductData productToUpdate = mapper.toData(product.toBuilder().id(id).build());
        return mapper.toEntity(repository.save(productToUpdate));
    }
}

