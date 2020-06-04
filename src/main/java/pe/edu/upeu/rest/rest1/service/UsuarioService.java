package pe.edu.upeu.rest.rest1.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.rest.rest1.model.Usuario;

public interface UsuarioService {
	public List<Usuario> listar();
	public Usuario create(Usuario user);
	public Optional<Usuario> readID(long id);
	public Usuario editUser(Usuario user);
	public void deleteUser(long id);
}
