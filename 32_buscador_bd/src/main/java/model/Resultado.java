

package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="resultados")
public class Resultado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idResultado;
	
	@Column(name="url")
	private String url;
	private String tematica; 
	private String descripcion;
 
	public Resultado() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Resultado(int idResultado,String url, String tematica, String desdripcion) {
		super();
		this.idResultado = idResultado;
		this.url = url;
		this.tematica = tematica;
		this.descripcion = descripcion;
	}
	
	public int getIdResultado() {
		return idResultado;
	}
	
	

	public void setIdResultado(int idResultado) {
		this.idResultado = idResultado;
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public String getTematica() {
		return tematica;
	}



	public void setTematica(String tematica) {
		this.tematica = tematica;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
}
