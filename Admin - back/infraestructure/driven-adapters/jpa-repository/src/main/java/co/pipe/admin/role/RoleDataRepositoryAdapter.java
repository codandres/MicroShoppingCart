package co.pipe.admin.role;

import co.pipe.admin.jpa.AdapterOperations;
import co.pipe.admin.model.role.Role;
import co.pipe.admin.model.role.gateways.RoleRepository;
import co.pipe.admin.role.mapper.RoleDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDataRepositoryAdapter
        extends AdapterOperations<Role, RoleData, Long, RoleDataMapper, RoleDataRepository>
        implements RoleRepository {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    public RoleDataRepositoryAdapter(RoleDataRepository repository, RoleDataMapper mapper) {
        super(repository, mapper);
    }
}