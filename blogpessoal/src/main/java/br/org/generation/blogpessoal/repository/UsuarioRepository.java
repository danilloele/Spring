package br.org.generation.blogpessoal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.blogpessoal.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long>{

	// método criado para checar se o usuario ja eiste no banco de dados
	public Optional <Usuario> findByUsuario (String usuario);
}
