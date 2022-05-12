package com.raifepaiva.msspringmongo.configs;

import com.raifepaiva.msspringmongo.domain.User;
import com.raifepaiva.msspringmongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    /*
        Classe para instanciação automática de elementos em banco de dados.
    * */

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();

        User maria = new User("Maria Silva", "msilva@gmail.com");
        User jorge = new User("Jorge Simão", "jorge.simao@outlook.com");
        User dora = new User("Dora Castro", "castro_d@gmail.com");

        userRepository.saveAll(Arrays.asList(maria,jorge,dora));


    }

}
