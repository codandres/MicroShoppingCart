package co.pipe.admin.product;

import co.pipe.admin.model.provider.Provider;
import co.pipe.admin.productprovider.ProductProviderData;
import co.pipe.admin.provider.ProviderData;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "product")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductData implements Serializable {
    private static final long serialVersionUID = 7863846767535193442L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String detail;
    private String imgUrl;
    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "product_provider",
            joinColumns = @JoinColumn(name = "id_product"),
            inverseJoinColumns = @JoinColumn(name = "id_provider"))
    private Set<ProviderData> idsProvider;


//    @OneToMany(mappedBy = "idProduct", cascade = CascadeType.ALL)
//    private transient Set<ProductProviderData> idsProductProvider;
}
