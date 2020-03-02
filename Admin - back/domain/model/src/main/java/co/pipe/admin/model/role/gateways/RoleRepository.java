package co.pipe.admin.model.role.gateways;

import co.pipe.admin.model.role.Role;

import java.util.List;

public interface RoleRepository {
    List<Role> findAll();

    Role findById(Long id);
}