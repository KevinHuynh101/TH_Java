package huynhnam.ShoppingCart.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartItem {
    private int productId;

    private String name;

    private Double price;

    private int quantity = 1;

}
