package br.com.marcos.marksell.services;

import br.com.marcos.marksell.entities.User;
import br.com.marcos.marksell.repositories.UserResporitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserResporitory resporitory;

    public List<User> findAll(){
        return resporitory.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = resporitory.findById(id);
        return obj.get();
    }

    public User insert(User obj){
        return resporitory.save(obj);
    }

    public void delete(Long id){
        resporitory.deleteById(id);
    }

    public User update(Long id, User obj) {
        User entity = resporitory.getReferenceById(id);
        updateData(entity, obj);
        return resporitory.save(entity);
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
