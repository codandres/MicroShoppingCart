package co.pipe.admin.provider.mapper;

import co.pipe.admin.jpa.SimpleMapper;
import co.pipe.admin.model.provider.Provider;
import co.pipe.admin.productprovider.mapper.ProductProviderDataMapper;
import co.pipe.admin.provider.ProviderData;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = ProductProviderDataMapper.class)
public interface ProviderDataMapper extends SimpleMapper<Provider, ProviderData> {

    @Override
    @Mapping(target = "idsProduct", ignore = true)
    Provider toEntity(ProviderData data);

    @Override
    @InheritInverseConfiguration
    ProviderData toData(Provider entity);
}
