package co.pipe.admin.api;

import co.pipe.admin.model.user.User;
import co.pipe.admin.usecase.user.UserUseCase;
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
public class UserRest {

    private final UserUseCase useCase;

    @GetMapping("/hola")
    public String mensaje() {
        return "hola";
    }

    @GetMapping("/user")
    public ResponseEntity<User> getAll() {
        return new ResponseEntity(useCase.findAll(), HttpStatus.OK);
    }

    @PostMapping("/user")
    public ResponseEntity<User> save(@Valid @RequestBody User user) {
        log.info("ENTRÓÓÓÓ");
        log.info("EL userREQ: " + user.toString());
        return new ResponseEntity(useCase.save(user), HttpStatus.OK);
    }

}
