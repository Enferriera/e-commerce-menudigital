package com.example.ecommerce.repositories;


import com.example.ecommerce.domain.entities.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends BaseRepository<Usuario, Long> {
}
