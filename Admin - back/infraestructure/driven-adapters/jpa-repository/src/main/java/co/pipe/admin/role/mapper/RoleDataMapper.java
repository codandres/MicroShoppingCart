package co.pipe.admin.role.mapper;

import co.pipe.admin.jpa.SimpleMapper;
import co.pipe.admin.model.role.Role;
import co.pipe.admin.role.RoleData;
import co.pipe.admin.user.mapper.UserDataMapper;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",
        uses = UserDataMapper.class)
public interface RoleDataMapper extends SimpleMapper<Role, RoleData> {

    @Override
    @Mapping(target = "users", ignore = true)
    Role toEntity(RoleData data);

    @Override
    @InheritInverseConfiguration
    RoleData toData(Role entity);

}
