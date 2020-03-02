package co.pipe.admin.user;

import co.pipe.admin.role.RoleData;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
public class UserData {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;
    private String username;

    private String email;
    private String password;
//    @JsonBackReference

    //    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @ManyToOne
    @JoinColumn(name = "id_role", insertable = false, updatable = false, referencedColumnName = "id")
    private RoleData idRole = new RoleData();
}