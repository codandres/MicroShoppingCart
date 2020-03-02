package co.pipe.admin.provider;

import co.pipe.admin.jpa.AdapterOperations;
import co.pipe.admin.model.provider.Provider;
import co.pipe.admin.model.provider.gateways.ProviderRepository;
import co.pipe.admin.provider.mapper.ProviderDataMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class ProviderDataRepositoryAdapter extends AdapterOperations<Provider, ProviderData, Long, ProviderDataMapper, ProviderDataRepository>
        implements ProviderRepository {
    public ProviderDataRepositoryAdapter(ProviderDataRepository repository, ProviderDataMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Provider update(Provider provider, Long id) {
        return null;
    }
}
