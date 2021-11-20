package org.ciberfarma.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_proveedor")
public class Proveedor {
	
	@Id
	@Column(name = "idproveedor")
	private int codigo;
	@Column(name = "nombre_rs")
	private String descripcion;
	
	private String telefono;
	private String email;
	
	
	
	
	
	public Proveedor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Proveedor(int codigo, String descripcion, String telefono, String email) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.telefono = telefono;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Proveedor [codigo=" + codigo + ", descripcion=" + descripcion + ", telefono=" + telefono + ", email=" + email
				+ "]";
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion ) {
		this.descripcion = descripcion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
}


