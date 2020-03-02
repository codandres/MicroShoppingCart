package co.pipe.admin.model.product;

import co.pipe.admin.model.productprovider.ProductProvider;
import co.pipe.admin.model.provider.Provider;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Product {
    private Long id;
    private String name;
    private String detail;
    private String imgUrl;
    private Set<Provider> idsProvider;
//    private Set<ProductProvider> idsProductProvider;
}
