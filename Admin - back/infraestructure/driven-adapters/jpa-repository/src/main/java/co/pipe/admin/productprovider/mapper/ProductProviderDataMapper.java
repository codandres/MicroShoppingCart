package co.pipe.admin.productprovider.mapper;

import co.pipe.admin.jpa.SimpleMapper;
import co.pipe.admin.model.productprovider.ProductProvider;
import co.pipe.admin.product.mapper.ProductDataMapper;
import co.pipe.admin.productprovider.ProductProviderData;
import co.pipe.admin.provider.mapper.ProviderDataMapper;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",
        uses = {ProductDataMapper.class, ProviderDataMapper.class})
public interface ProductProviderDataMapper extends SimpleMapper<ProductProvider, ProductProviderData> {

    @Override
    @Mapping(target = "idProduct.idsProvider", ignore = true)
    @Mapping(target = "idProvider.idsProduct", ignore = true)
    ProductProvider toEntity(ProductProviderData data);

    @Override
    @InheritInverseConfiguration
    ProductProviderData toData(ProductProvider entity);
}
