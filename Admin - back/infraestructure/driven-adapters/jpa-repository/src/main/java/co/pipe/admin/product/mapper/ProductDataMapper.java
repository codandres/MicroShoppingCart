package co.pipe.admin.product.mapper;

import co.pipe.admin.jpa.SimpleMapper;
import co.pipe.admin.model.product.Product;
import co.pipe.admin.product.ProductData;
import co.pipe.admin.productprovider.mapper.ProductProviderDataMapper;
import co.pipe.admin.provider.mapper.ProviderDataMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",
uses = ProviderDataMapper.class)
public interface ProductDataMapper extends SimpleMapper<Product, ProductData> {
}
