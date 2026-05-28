package br.com.marcos.marksell.repositories;

import br.com.marcos.marksell.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
