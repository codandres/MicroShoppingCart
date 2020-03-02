package co.pipe.admin.api;

import co.pipe.admin.model.provider.Provider;
import co.pipe.admin.usecase.provider.ProviderUseCase;
import co.pipe.admin.usecase.provider.ProviderUseCase;
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
public class ProviderRest {

    private final ProviderUseCase useCase;

    @GetMapping("/provider")
    public ResponseEntity<Provider> getAll() {
        return new ResponseEntity(useCase.findAll(), HttpStatus.OK);
    }

    @PostMapping("/provider")
    public ResponseEntity<Provider> save(@Valid @RequestBody Provider provider) {
        log.info("ENTRÓÓÓÓ");
        log.info("EL providerREQ: " + provider.toString());
        return new ResponseEntity(useCase.save(provider), HttpStatus.OK);
    }

}
