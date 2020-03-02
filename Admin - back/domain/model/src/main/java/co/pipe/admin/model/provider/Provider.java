package co.pipe.admin.model.provider;

import co.pipe.admin.model.country.Country;
import co.pipe.admin.model.product.Product;
import co.pipe.admin.model.productprovider.ProductProvider;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Provider {
    private Long id;
    private String name;
    private Set<Product> idsProduct;

//    private Set<ProductProvider> idsProductProvider;
//    private Country idCountry;
}