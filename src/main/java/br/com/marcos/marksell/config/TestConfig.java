package br.com.marcos.marksell.config;

import br.com.marcos.marksell.entities.User;
import br.com.marcos.marksell.repositories.UserResporitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")//configuração do perfil de teste
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserResporitory userResporitory;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        userResporitory.saveAll(Arrays.asList(u1, u2));
    }
}
