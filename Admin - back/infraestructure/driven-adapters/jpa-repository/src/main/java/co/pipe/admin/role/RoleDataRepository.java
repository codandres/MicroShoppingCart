package co.pipe.admin.role;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface RoleDataRepository extends CrudRepository<RoleData, Long>, QueryByExampleExecutor<RoleData> {
}
