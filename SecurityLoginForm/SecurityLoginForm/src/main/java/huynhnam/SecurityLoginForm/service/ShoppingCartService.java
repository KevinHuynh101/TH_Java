package huynhnam.SecurityLoginForm.service;

import huynhnam.SecurityLoginForm.model.CartItem;

import java.util.Collection;

public interface ShoppingCartService {
    Collection<CartItem> getAllItems();
    void add(CartItem newItem);
    void remove(int id);
    CartItem update (int productID, int quantity);
    void clear();
    double getAmount();
    int getCount();

}
