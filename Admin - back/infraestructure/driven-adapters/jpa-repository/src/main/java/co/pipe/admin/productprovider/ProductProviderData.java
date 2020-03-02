package co.pipe.admin.productprovider;

import co.pipe.admin.product.ProductData;
import co.pipe.admin.productprovider.type.ProductProviderId;
import co.pipe.admin.provider.ProviderData;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "product_provider")
@IdClass(ProductProviderId.class)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductProviderData {
//    private static final long serialVersionUID = 3296305954291417596L;

//    @EmbeddedId
//    private ProductProviderId3 idProductProvider;
//    private BigDecimal price;

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_product", referencedColumnName = "id")
    private ProductData idProduct;

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_provider", referencedColumnName = "id")
    private ProviderData idProvider;

    private Integer quantity;
    private BigDecimal price;
}