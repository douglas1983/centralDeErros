package com.codenation.curso.central.error.dto.response;

import com.codenation.curso.central.error.models.Auditable;
import com.codenation.curso.central.error.models.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
//Adiciona um construtor vazio
@NoArgsConstructor
//adiciona um construtor com todos os metodos
@AllArgsConstructor
// Cria um construtor privado com todos os atributos.
public class UserResponse  {

    private Long id;
    private String name;
    private String userEmail;
    private String role;

    public static UserResponse transformaEmDTO(User user) {
    	
        return new UserResponse(user.getId(),user.getName(),user.getUserEmail(),user.getRole());
    }

	

	

}

