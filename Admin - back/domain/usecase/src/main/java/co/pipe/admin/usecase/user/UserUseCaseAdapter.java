package co.pipe.admin.usecase.user;

import co.pipe.admin.model.user.User;

import java.util.List;
import java.util.UUID;

public interface UserUseCaseAdapter {
    User save(User user);

    User findById(UUID id);

    List<User> findAll();

}
