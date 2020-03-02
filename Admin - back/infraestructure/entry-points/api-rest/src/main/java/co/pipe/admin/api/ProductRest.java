package co.pipe.admin.api;

import co.pipe.admin.model.product.Product;
import co.pipe.admin.usecase.product.ProductUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api/admin", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class ProductRest {

    private final ProductUseCase useCase;

    @GetMapping("/product")
    public ResponseEntity<List<Product>> getAll() {
        return new ResponseEntity(useCase.findAll(), HttpStatus.OK);
    }


    @PostMapping("/product/{id}")
    public ResponseEntity<Product> getById(@PathVariable Long id) {
        return new ResponseEntity(useCase.findById(id), HttpStatus.OK);
    }

    @PostMapping("/product")
    public ResponseEntity<Product> save(@Valid @RequestBody Product product) {
        log.info("ENTRÓÓÓÓ");
        log.info("EL productREQ: " + product.toString());
        return new ResponseEntity(useCase.save(product), HttpStatus.OK);
    }

}
