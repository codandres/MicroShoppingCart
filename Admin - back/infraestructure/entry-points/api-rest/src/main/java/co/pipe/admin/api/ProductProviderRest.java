package co.pipe.admin.api;

import co.pipe.admin.model.productprovider.ProductProvider;
import co.pipe.admin.usecase.productprovider.ProductProviderUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping(value = "/api/admin", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class ProductProviderRest {

    private final ProductProviderUseCase useCase;

    @GetMapping("/product_provider")
    public ResponseEntity<ProductProvider> getAll() {
        return new ResponseEntity(useCase.findAll(), HttpStatus.OK);
    }

    @PostMapping("/product_provider")
    public ResponseEntity<ProductProvider> save(@Valid @RequestBody ProductProvider productProvider) {
        log.info("ENTRÓÓÓÓ");
        log.info("EL productREQ: " + productProvider.toString());
        return new ResponseEntity(useCase.save(productProvider), HttpStatus.OK);
    }

}
