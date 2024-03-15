package com.picpaysimplificado.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.picpaysimplificado.domain.user.User;

public interface UserRepository extends JpaRepository<User, Long>{
    // Definindo um método que vai buscar usuários por documento/cpf
    Optional<User> findUserByDocument(String document);
    Optional<User> findUserById(Long id);
}
