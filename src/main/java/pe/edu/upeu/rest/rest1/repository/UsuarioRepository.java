package pe.edu.upeu.rest.rest1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.rest.rest1.model.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
    
}