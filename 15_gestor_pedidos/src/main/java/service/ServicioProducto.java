package service;

import java.util.ArrayList;
import java.util.List;

import model.Producto;

public class ServicioProducto {
	private static List<Producto> productos= new ArrayList<Producto>();
	
	public void eliminarProducto(String nombre) {
		productos.removeIf(p->p.equals(nombre));		
		
	}
	public void añadirProducto(Producto producto) {
		productos.add(producto);	
	}
 
	public List<Producto> BuscarPorCategoria(String categoria) {
		return productos.stream().filter(p -> p.equals(categoria))
				.toList();
	}

}
