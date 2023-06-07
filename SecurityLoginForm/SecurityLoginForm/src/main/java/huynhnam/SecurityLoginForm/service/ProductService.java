package huynhnam.SecurityLoginForm.service;



import huynhnam.SecurityLoginForm.model.Product;

import java.util.List;

public interface ProductService {

    void saveProduct(Product product);
    Product getProductById(int id);
    void deleteProductById(int id);

    List<Product> getAllProducts();
}
