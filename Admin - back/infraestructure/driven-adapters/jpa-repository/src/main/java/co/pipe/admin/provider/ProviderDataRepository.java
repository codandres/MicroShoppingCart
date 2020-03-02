package co.pipe.admin.provider;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface ProviderDataRepository
        extends CrudRepository<ProviderData, Long>,
        QueryByExampleExecutor<ProviderData> {
}
