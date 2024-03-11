/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucan.api.config;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import ucan.api.domain.User;
import ucan.api.repositories.UserRepository;

/**
 *
 * @author denizia
 */
@Configuration
@Profile("local")
public class LocalConfig
{
    
    @Autowired
    private UserRepository userRepository;
    
    @Bean
    public void startDB(){
        User u1 = new User(null, "Denizia", "denizia@gmail.com", "123");
        User u2 = new User(null, "Fernanda", "fernanda@gmail.com", "123");
    
        userRepository.saveAll(List.of(u1, u2));
    }
}
