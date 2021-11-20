package org.ciberfarma.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_usuario")
public class Usuario {
	
		@Id
		@Column(name="cod_usua")
		private int codigo;

		@Column (name="nom_usua")
		private String nombre;	

		@Column (name="ape_usua")
		private String apellidos;
	
		@Column(name="usr_usua")
		private String correo;
		

		@Column(name= "cla_usua")
		private String clave;
	

		@Column(name= "fna_usua")
		private String fechanacimiento;
	

		@Column(name= "idtipo")
		private int tipo;
	

		@Column(name= "est_usua")
		private int estado;
		
		@Override
		public String toString() {
			return "Usuario [codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", correo="
					+ correo + ", clave=" + clave + ", fechanacimiento=" + fechanacimiento + ", tipo=" + tipo
					+ ", estado=" + estado + "]";
		}


		public int getCodigo() {
			return codigo;
		}


		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}


		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		public String getCorreo() {
			return correo;
		}

		public void setCorreo(String correo) {
			this.correo = correo;
		}

		public String getClave() {
			return clave;
		}

		public void setClave(String clave) {
			this.clave = clave;
		}

		public String getFechanacimiento() {
			return fechanacimiento;
		}

		public void setFechanacimiento(String fechanacimiento) {
			this.fechanacimiento = fechanacimiento;
		}

		public int getTipo() {
			return tipo;
		}


		public void setTipo(int tipo) {
			this.tipo = tipo;
		}

		public int getEstado() {
			return estado;
		}

		public void setEstado(int estado) {
			this.estado = estado;
		}

		
}
