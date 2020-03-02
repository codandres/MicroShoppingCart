package co.pipe.admin.model.user;

import co.pipe.admin.model.role.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.util.UUID;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private UUID id;
    @Pattern(regexp = "^[A-Za-z].*$", message = "El usuario debe comenzar con una letra")
    @Pattern(regexp = "^[A-Za-z0-9._-]+$", message = "Solo caracteres alfanuméricos, punto, guiones bajo y medio")
    @NotNull(message = "El nombre de usuario no puede ser nulo")
    @Size(max = 20, message = "Usuario de máximo 20 caracteres")
    private String username;
    @Email(message = "Correo electrónico no válido")
    private String email;
    @NotBlank(message = "Contrasña no puede estar vacía")
    private String password;
    private Role idRole;
}