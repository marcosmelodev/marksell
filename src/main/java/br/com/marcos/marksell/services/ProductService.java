package br.com.marcos.marksell.services;

import br.com.marcos.marksell.entities.Product;
import br.com.marcos.marksell.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository resporitory;

    public List<Product> findAll(){
        return resporitory.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = resporitory.findById(id);
        return obj.get();
    }
}
