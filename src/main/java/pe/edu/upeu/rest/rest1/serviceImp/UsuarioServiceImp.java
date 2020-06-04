package pe.edu.upeu.rest.rest1.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.rest.rest1.model.Usuario;
import pe.edu.upeu.rest.rest1.repository.UsuarioRepository;
import pe.edu.upeu.rest.rest1.service.UsuarioService;

@Service
public class UsuarioServiceImp implements UsuarioService{
    @Autowired
    UsuarioRepository usuarioRepository;

    public List<Usuario> listar(){
        return usuarioRepository.findAll();
    }
    public Usuario create(Usuario user){
        return usuarioRepository.save(user);
    }
    public Optional<Usuario> readID(long id){
        return usuarioRepository.findById(id);        
    }
    public Usuario editUser(Usuario user){       
        return usuarioRepository.save(user);
    }
    public void deleteUser(long id){
        Usuario user = usuarioRepository.findById(id).orElse(null);
        usuarioRepository.delete(user);
    }

}