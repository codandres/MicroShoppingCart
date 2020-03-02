package co.pipe.admin.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.util.UUID;

public interface UserDataRepository
        extends CrudRepository<UserData, UUID>,
        QueryByExampleExecutor<UserData> {
//public interface UserDataRepository extends CrudRepository<UserData, UUID> {


}
