package co.pipe.admin.config;


import co.pipe.admin.model.product.gateways.ProductRepository;
import co.pipe.admin.model.productprovider.gateways.ProductProviderRepository;
import co.pipe.admin.model.provider.gateways.ProviderRepository;
import co.pipe.admin.model.user.gateways.UserRepository;
import co.pipe.admin.usecase.product.ProductUseCase;
import co.pipe.admin.usecase.productprovider.ProductProviderUseCase;
import co.pipe.admin.usecase.provider.ProviderUseCase;
import co.pipe.admin.usecase.user.UserUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public UserUseCase configUserUseCase(UserRepository repository) {
        return new UserUseCase(repository);
    }

    @Bean
    public ProductUseCase configProductUseCase(ProductRepository repository) {
        return new ProductUseCase(repository);
    }

    @Bean
    public ProviderUseCase configProviderUseCase(ProviderRepository repository) {
        return new ProviderUseCase(repository);
    }

    @Bean
    public ProductProviderUseCase configProductProviderUseCase(ProductProviderRepository repository) {
        return new ProductProviderUseCase(repository);
    }


}
