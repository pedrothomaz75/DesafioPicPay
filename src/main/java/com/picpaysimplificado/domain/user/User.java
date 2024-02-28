package com.picpaysimplificado.domain.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

// Anotação de que a classe User vai ser uma entidade no banco de dados
@Entity(name="users")
// Anotação de que o nome da tabela do banco de dados vai ser "users" 
@Table(name="users")
// Gera um atalho de obtenção de dados
@Getter
// Gera um atalho de inscrição de dados
@Setter

public class User{
    
}