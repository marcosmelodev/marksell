package br.com.marcos.marksell.services;

import br.com.marcos.marksell.entities.Category;
import br.com.marcos.marksell.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository resporitory;

    public List<Category> findAll(){
        return resporitory.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = resporitory.findById(id);
        return obj.get();
    }
}
