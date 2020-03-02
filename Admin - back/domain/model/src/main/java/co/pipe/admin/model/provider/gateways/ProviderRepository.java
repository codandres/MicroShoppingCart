package co.pipe.admin.model.provider.gateways;

import co.pipe.admin.model.provider.Provider;

import java.util.List;

public interface ProviderRepository {
    List<Provider> findAll();

    Provider findById(Long id);

    Provider save(Provider provider);

    void deleteById(Long id);

    Provider update(Provider provider, Long id);
}
