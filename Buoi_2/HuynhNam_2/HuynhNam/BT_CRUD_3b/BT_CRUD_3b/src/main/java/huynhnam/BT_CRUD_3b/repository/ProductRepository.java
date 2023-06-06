package huynhnam.BT_CRUD_3b.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import huynhnam.BT_CRUD_3b.model.Product;
public interface ProductRepository extends JpaRepository<Product, Long> {

}
