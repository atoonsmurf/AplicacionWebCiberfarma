package org.ciberfarma.repository;

import org.ciberfarma.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IProductoRepository extends JpaRepository<Producto, String> {

	//public int registrar(Producto p);<-- CRUD
	
	
}
