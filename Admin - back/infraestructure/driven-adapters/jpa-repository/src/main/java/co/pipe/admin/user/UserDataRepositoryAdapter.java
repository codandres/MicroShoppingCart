package co.pipe.admin.user;

import co.pipe.admin.jpa.AdapterOperations;
import co.pipe.admin.model.user.User;
import co.pipe.admin.model.user.gateways.UserRepository;
import co.pipe.admin.user.mapper.UserDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
//LINEA ABAJO COMENTADA PARA ADAPTER OPERATIONS LEGACY
//public class UserDataRepositoryAdapter extends AdapterOperationsLegacy<User, UserData, UUID, UserDataRepository> implements UserRepository {
public class UserDataRepositoryAdapter extends AdapterOperations<User, UserData, UUID, UserDataMapper, UserDataRepository> implements UserRepository {

// CON ADAPTEROOPERATIONS LEGACY CONSTRUCTOR
//    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
//    @Autowired
//    public UserDataRepositoryAdapter(UserDataRepository repository, ObjectMapper mapper, UserDataMapper userDataMapper) {
//        super(repository, mapper, (UserData data) -> mapper.mapBuilder(data, User.UserBuilder.class).build());
//    }

    //    CONSTRUCTOR CON MAPSTRUCT
    public UserDataRepositoryAdapter(UserDataRepository repository, UserDataMapper mapper) {
        super(repository, mapper);
    }
}
