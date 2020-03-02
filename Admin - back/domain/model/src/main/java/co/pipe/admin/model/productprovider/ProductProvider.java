package co.pipe.admin.model.productprovider;

import co.pipe.admin.model.product.Product;
import co.pipe.admin.model.provider.Provider;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class ProductProvider {
    private Product idProduct;
    private Provider idProvider;
    private Integer quantity;
    private BigDecimal price;
}