package br.com.marcos.marksell.repositories;

import br.com.marcos.marksell.entities.OrderItem;
import br.com.marcos.marksell.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemResporitory extends JpaRepository<OrderItem, Long> {
}
