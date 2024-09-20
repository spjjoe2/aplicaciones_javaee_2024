package dao;

import model.Cliente;

public interface ClientesDao {

	public Cliente findByUsr(String usr);

	public void save(Cliente cliente);

}