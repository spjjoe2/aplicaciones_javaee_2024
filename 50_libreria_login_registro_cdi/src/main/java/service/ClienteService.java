package service;

import dtos.ClienteDto;

public interface ClienteService {
	 
	boolean login(String usuario, String password); 
	boolean guardarCliente(ClienteDto cliente);

}
