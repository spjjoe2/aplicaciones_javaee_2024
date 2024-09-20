package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;


@Entity
@Table(name="clientes")
@NamedQuery(name="Cliente.findByIdUsr",query="select c from Cliente c where c.usuario=?1") 
public class Cliente { 
 
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int idCliente;
		private String usuario;
		private String password;
		private String email;
		private int telefono;
		public Cliente(int idCliente, String usuario, String password, String email, int telefono) {
			super();
			this.idCliente = idCliente;
			this.usuario = usuario;
			this.password = password;
			this.email = email;
			this.telefono = telefono;
		}
		public Cliente() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getIdCliente() {
			return idCliente;
		}
		public void setIdCliente(int idCliente) {
			this.idCliente = idCliente;
		}
		public String getUsuario() {
			return usuario;
		}
		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getTelefono() {
			return telefono;
		}
		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}	

}
