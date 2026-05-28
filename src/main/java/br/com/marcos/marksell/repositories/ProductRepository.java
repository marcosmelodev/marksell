package br.com.marcos.marksell.repositories;

import br.com.marcos.marksell.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
