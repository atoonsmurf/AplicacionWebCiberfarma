package org.ciberfarma.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_categorias")
public class Categoria {
	
	@Id
	private int idcategoria;
	private String descripcion;
	
	
	@Override
	public String toString() {
		return "Categoria [idcategoria=" + idcategoria + ", descripcion=" + descripcion + "]";
	}
		
	public int getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}


