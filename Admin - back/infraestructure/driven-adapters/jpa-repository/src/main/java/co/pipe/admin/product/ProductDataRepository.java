package co.pipe.admin.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface ProductDataRepository extends JpaRepository<ProductData, Long>, QueryByExampleExecutor<ProductData> {

}