package co.pipe.admin.productprovider.type;

import co.pipe.admin.product.ProductData;
import co.pipe.admin.provider.ProviderData;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductProviderId3 implements Serializable {
    @Column(name = "id_product", nullable = false)
    private ProductData idProduct;
    @Column(name = "id_provider", nullable = false)
    private ProviderData idProvider;

}