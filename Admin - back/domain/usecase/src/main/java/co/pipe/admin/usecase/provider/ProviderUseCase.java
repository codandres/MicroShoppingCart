package co.pipe.admin.usecase.provider;

import co.pipe.admin.model.provider.Provider;
import co.pipe.admin.model.provider.gateways.ProviderRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ProviderUseCase {
    private final ProviderRepository repository;

    public List<Provider> findAll() {
        return repository.findAll();
    }

    public Provider findById(Long id) {
        return repository.findById(id);
    }

    public Provider save(Provider id) {
        return repository.save(id);
    }
}
