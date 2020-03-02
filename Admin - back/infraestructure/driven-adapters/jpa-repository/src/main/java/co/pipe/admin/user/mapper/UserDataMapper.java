package co.pipe.admin.user.mapper;

import co.pipe.admin.jpa.SimpleMapper;
import co.pipe.admin.model.user.User;
import co.pipe.admin.role.mapper.RoleDataMapper;
import co.pipe.admin.user.UserData;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",
        uses = RoleDataMapper.class)
public interface UserDataMapper extends SimpleMapper<User, UserData> {

//    @Override
////    @Mapping(source = "idRole", target = "idRole.id")
//    @Mapping(source = "entity.idRole", target = "idRole.id")
//    UserData toData(User entity);
//
//    @Override
//    @InheritInverseConfiguration
//    User toEntity(UserData data);
}