package co.pipe.admin.model.user.gateways;


import co.pipe.admin.model.user.User;

import java.util.List;
import java.util.UUID;

public interface UserRepository {
    User save(User user);

    User findById(UUID id);

    List<User> findAll();
}

