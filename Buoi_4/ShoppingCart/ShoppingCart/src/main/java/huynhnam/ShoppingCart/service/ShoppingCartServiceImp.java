package huynhnam.ShoppingCart.service;

import huynhnam.ShoppingCart.model.CartItem;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ShoppingCartServiceImp implements ShoppingCartService{
    Map<Integer, CartItem> shopingCart= new HashMap<>();

    @Override
    public void add(CartItem newItem){
        CartItem cartItem = shopingCart.get(newItem.getProductId());
        if(cartItem == null){
            shopingCart.put(newItem.getProductId(),newItem);
        }else{
            cartItem.setQuantity(cartItem.getQuantity() + 1);
        }
    }
    @Override
    public void remove(int id) {
        shopingCart.remove(id);
    }

    @Override
    public CartItem update(int productId, int quantity) {
        CartItem cartItem = shopingCart.get(productId);
        cartItem.setQuantity(quantity);
        return cartItem;
    }
    @Override
    public void clear(){
        shopingCart.clear();
    }

    @Override
    public Collection<CartItem> getAllItems() {
        return shopingCart.values();
    }
    @Override
    public int getCount() {
        return shopingCart.values().size();
    }


    @Override
    public double getAmount(){
        return shopingCart.values().stream()
                .mapToDouble(item -> item.getQuantity() * item.getPrice())
                .sum();
    }
}

