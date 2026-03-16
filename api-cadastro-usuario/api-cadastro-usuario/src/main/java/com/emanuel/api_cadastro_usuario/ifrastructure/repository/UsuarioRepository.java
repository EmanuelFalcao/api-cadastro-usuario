package com.emanuel.api_cadastro_usuario.ifrastructure.repository;

import com.emanuel.api_cadastro_usuario.ifrastructure.entitys.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional <Usuario> findByEmail(String email);
    @Transactional
    void deleteByEmail(String email);
}
