package br.com.marcos.marksell.repositories;

import br.com.marcos.marksell.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserResporitory extends JpaRepository<User, Long> {
}
