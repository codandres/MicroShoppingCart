package co.pipe.admin.country;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
@Getter
@Setter
@NoArgsConstructor
public class CountryData {
    @Id
    private Long id;
    private String name;
}