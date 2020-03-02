package co.pipe.admin.productprovider;

import co.pipe.admin.productprovider.type.ProductProviderId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface ProductProviderDataRepository
        extends JpaRepository<ProductProviderData, ProductProviderId>,
        QueryByExampleExecutor<ProductProviderData> {
}