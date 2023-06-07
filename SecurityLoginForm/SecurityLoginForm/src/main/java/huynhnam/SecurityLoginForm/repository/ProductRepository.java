package huynhnam.SecurityLoginForm.repository;


import huynhnam.SecurityLoginForm.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
