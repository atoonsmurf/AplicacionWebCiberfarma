package org.ciberfarma.repository;

import org.ciberfarma.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {

	//CRUD
	
	
	//proceso validar(busquead) segun correo y clave --> Usuario
	

	  Usuario findByCorreoAndClave(String correo, String clave);
	
}
