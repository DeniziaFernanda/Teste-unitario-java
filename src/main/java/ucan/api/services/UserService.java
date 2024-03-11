/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ucan.api.services;

import ucan.api.domain.User;

/**
 *
 * @author denizia
 */
public interface UserService
{
     User findById(Integer id);
}
