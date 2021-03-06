package lebed.ecommerce.hateos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lebed.ecommerce.model.product.Product;
import org.springframework.hateoas.ResourceSupport;

public class ProductResource extends ResourceSupport {

    @JsonProperty
    private Long id;

    @JsonProperty
    private String name;

    @JsonProperty
    private String price;

    @JsonProperty
    private String description;

    private Object group;

    public ProductResource(Product product) {
        id = product.getId();
        name = product.getName();
        price = product.getPrice();
        description = product.getDescription();
        group = product.getGroup();
    }

}
