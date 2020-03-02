package co.pipe.admin.productprovider;

import co.pipe.admin.jpa.AdapterOperations;
import co.pipe.admin.model.product.Product;
import co.pipe.admin.model.productprovider.ProductProvider;
import co.pipe.admin.model.productprovider.gateways.ProductProviderRepository;
import co.pipe.admin.model.provider.Provider;
import co.pipe.admin.product.ProductData;
import co.pipe.admin.product.mapper.ProductDataMapper;
import co.pipe.admin.productprovider.mapper.ProductProviderDataMapper;
import co.pipe.admin.productprovider.type.ProductProviderId;
import co.pipe.admin.provider.mapper.ProviderDataMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Slf4j
@Repository
//@RequiredArgsConstructor
public class ProductProviderDataRepositoryAdapter
        extends AdapterOperations<ProductProvider, ProductProviderData, ProductProviderId, ProductProviderDataMapper, ProductProviderDataRepository>
        implements ProductProviderRepository {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private ProductDataMapper productMapper;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private ProviderDataMapper providerMapper;

    @Autowired
    public ProductProviderDataRepositoryAdapter(ProductProviderDataRepository repository, ProductProviderDataMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public ProductProvider findById(Product idProduct, Provider idProvider) {
        final ProductProviderId id =
                ProductProviderId.builder()
                        .idProduct(productMapper.toData(idProduct))
                        .idProvider(providerMapper.toData(idProvider))
                        .build();
        final Optional<ProductProviderData> res = repository.findById(id);
        if (res.isPresent())
            return mapper.toEntity(res.get());
        return mapper.toEntity(res.orElse(new ProductProviderData()));
    }

    @Override
    public void deleteById(Product idProduct, Provider idProvider) {
        log.info("HOLIWIS");
    }

    @Override
    public ProductProvider update(ProductProvider productProvider) {
        return null;
    }
}
