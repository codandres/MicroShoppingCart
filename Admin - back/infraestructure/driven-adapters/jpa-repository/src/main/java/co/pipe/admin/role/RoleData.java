package co.pipe.admin.role;

import co.pipe.admin.model.user.User;
import co.pipe.admin.user.UserData;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role")
@Data
@NoArgsConstructor
public class RoleData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    private String name;

    @OneToMany(targetEntity = UserData.class, mappedBy = "idRole", fetch = FetchType.LAZY)
    private Set<UserData> users;
}