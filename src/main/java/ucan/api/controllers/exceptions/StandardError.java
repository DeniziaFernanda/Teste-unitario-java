/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucan.api.controllers.exceptions;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author denizia
 */
@Getter
@Setter
@AllArgsConstructor
public class StandardError
{
    private LocalDateTime timestamp;
    private Integer status;
    private String error;
    private String path;
}
