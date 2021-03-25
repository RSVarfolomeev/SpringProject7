package files.repositories;

import files.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByTitle(String title);
    List<Product> findAllByPriceIsBetween(int min_price, int max_price);
    List<Product> findAllByPriceGreaterThanEqual(int min_price);
    List<Product> findAllByPriceIsLessThanEqual(int max_price);
}
