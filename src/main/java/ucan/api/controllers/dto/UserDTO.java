/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucan.api.controllers.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author denizia
 */
@Getter
@Setter
@NoArgsConstructor
public class UserDTO
{
    private Integer id;
    private String name;
    private String email;
   
    //@JsonIgnore -> vai ignorar ele em tudo
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) // vai permitit ele ser usado apenas na escrita.
    private String password;
}
