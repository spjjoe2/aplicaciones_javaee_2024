package service;

import dao.ClientesDao;
import dtos.ClienteDto;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import mappers.Mapeador;
import model.Cliente;

@Named
public class ClienteServiceImpl implements ClienteService{
	
	
	@Inject
	ClientesDao clientesDao;
	@Inject
	Mapeador mapeador;
	
	@Override
	public boolean guardarCliente(ClienteDto cliente) {
		if(clientesDao.findByUsr(cliente.getUsuario())!=null){
			return false;
		}
		clientesDao.save(mapeador.clienteDtoToEntity(cliente));
		return true;
	}
	
	public boolean login(String usuario, String password) {
		Cliente cliente =clientesDao.findByUsr(usuario);		 
		return cliente!=null&&cliente.getPassword().equals(password);			 			
		 
		 
	};

}
