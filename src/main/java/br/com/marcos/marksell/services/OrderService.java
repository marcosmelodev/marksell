package br.com.marcos.marksell.services;


import br.com.marcos.marksell.entities.Order;
import br.com.marcos.marksell.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository resporitory;

    public List<Order> findAll(){
        return resporitory.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = resporitory.findById(id);
        return obj.get();
    }
}
