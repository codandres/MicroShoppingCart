package co.pipe.admin.productprovider.type;

import co.pipe.admin.product.ProductData;
import co.pipe.admin.provider.ProviderData;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;


//@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class ProductProviderId implements Serializable {
    private static final long serialVersionUID = 8020008483093071312L;
    private ProductData idProduct;
    private ProviderData idProvider;
//    private ProductData idProduct;
//    private ProviderData idProvider;
}
