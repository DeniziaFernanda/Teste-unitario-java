/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucan.api.controllers;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ucan.api.controllers.dto.UserDTO;
import ucan.api.domain.User;
import ucan.api.services.UserService;

/**
 *
 * @author denizia
 */

@RestController 
@RequestMapping(value = "/user")
public class UserController
{
    @Autowired
    private ModelMapper mapper;
    
    @Autowired
    private UserService userService;
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Integer id){
        return ResponseEntity.ok().body(mapper.map(userService.findById(id), UserDTO.class));
    }
    
    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll(){
        List<User> list = userService.findAll();
        List<UserDTO> listDTO = list.stream().map(x -> mapper.map(x, UserDTO.class)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }
}
