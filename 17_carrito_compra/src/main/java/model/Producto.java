package model;

public class Producto {
	private String nombre;
	private Double precio;
	private String categoria;
	public Producto(String nombre, Double precio, String categoría) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoría;
	}
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoría) {
		this.categoria = categoria;
	}
	
	

}