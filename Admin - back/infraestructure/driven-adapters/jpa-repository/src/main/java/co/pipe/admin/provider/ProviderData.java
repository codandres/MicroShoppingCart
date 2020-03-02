package co.pipe.admin.provider;

import co.pipe.admin.country.CountryData;
import co.pipe.admin.product.ProductData;
import co.pipe.admin.productprovider.ProductProviderData;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "provider")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProviderData implements Serializable {
    private static final long serialVersionUID = -8512252707271818024L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "idsProvider")
    private Set<ProductData> idsProduct;





//    @OneToMany(mappedBy = "idProvider", cascade = CascadeType.ALL)
//    private transient Set<ProductProviderData> idsProductProvider;

//    @ManyToOne
//    private CountryData idCountry;
}
