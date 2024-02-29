/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucan.api.domain;

import javax.persistence.*;
import lombok.*;

/**
 *
 * @author denizia
 */
/* @Data: o @Data contem dentro de si as anotações @Getter, @Setter, @EqualsAndHashCode e outras. todas essas servem para que a gente não precese mais escrever 
alguns codigos no nosso projetos eles serão gerados atravez dessas anotações.
*/
//@Getter
//@Setter
//@EqualsAndHashCode // para compração da class, porém normalmente é feito apenas com o id, na anotação ele faz com todos atributos da class, nada perfomatico para classes com muitos atributos

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User
{
    @Id // já que a nossa classe é recebe a anotação @Entity ela implica que será criado uma tabela com esse nome na bd, e essa tabela precisa de uma chave primaria.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    
    @Column(unique = true) // ele vai gerar um wrong caso haja valares duplicado.
    private String email;
    private String password;
}

 