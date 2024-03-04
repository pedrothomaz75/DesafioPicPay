package com.picpaysimplificado.domain.user;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
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
// Vai criar o construtor que vai receber todos os parâmetros da classe
@AllArgsConstructor
// id vai ser a chave única do meu banco
@EqualsAndHashCode(of = "id")
public class User{

    // Início de campos que vão estar dentro do usuário
    @Id // Gera o ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Strategia para geração de ID's, vai gerar o id de forma incremental
    private Long id;

    private String firstName;

    private String lastName;

    @Column(unique=true) // A coluna document vai ter valor único na tabela
    private String document;
    
    @Column(unique=true) // A coluna email vai ter valor único na tabela
    private String email;
    
    private String password;

    // BigDecimal = tipo primtivo usado para números extensos
    private BigDecimal balance; // Saldo do usuário

    @Enumerated(EnumType.STRING) // Basicamente faz com que o userType represente um dos valores de UserType, sem estanciação
    private UserType userType;
}