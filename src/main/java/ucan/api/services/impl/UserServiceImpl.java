/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucan.api.services.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ucan.api.domain.User;
import ucan.api.repositories.UserRepository;
import ucan.api.services.UserService;
import ucan.api.services.exceptions.ObjectNotFoundException;

/**
 *
 * @author denizia
 */
@Service
public class UserServiceImpl implements UserService
{

    @Autowired
    private UserRepository userRepository;
    
    @Override
    public User findById(Integer id)
    {
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("User não encontrado"));
    }
    
    @Override
    public List<User> findAll()
    {
        return userRepository.findAll();
    }
}
