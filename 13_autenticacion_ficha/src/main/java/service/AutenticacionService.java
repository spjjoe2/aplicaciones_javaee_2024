package service;

import java.util.List;

import model.Ficha;

public class AutenticacionService {
	
	private final String USER="admin";
	private final String PASSWORD= "curso";
		
	List<Ficha> fichas =List.of(new Ficha("ar",19,"aa@gmail.com"),
			new Ficha("admin",24,"admi@gmail.com"),
			new Ficha("jose",49,"jos@gmail.com"),
			new Ficha("hup",35,"ddd@gmail.com")
			);
		
	public boolean autenticar(String nombre, String password) {
		  return nombre.equals(USER)&&password.equals(PASSWORD);
	} 
	
	public Ficha fichaUsuario(String nombre) {
		 return fichas.stream().filter(f->f.getNombre().equals(nombre))
				 .findFirst()
				 .orElse(new Ficha());
	} 

}
