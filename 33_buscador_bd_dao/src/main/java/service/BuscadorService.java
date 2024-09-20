package service;

import java.util.List;
import java.util.Optional;

import dao.BuscadorDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.Resultado;

public class BuscadorService {
	 
	BuscadorDao dao = new BuscadorDao();
 
	
	public boolean altaResultado(Resultado resultado) {
		if(dao.findByUrl(resultado.getUrl())==null){
			dao.save(resultado);			
		}
		return true;
	}
	
	public Optional<Resultado> buscarResultadoPorId(int idResultado) {
		Resultado resultado =dao.findById(idResultado);
		return resultado!=null?Optional.of(resultado):Optional.empty();
	}
	
	public Optional<Resultado> eliminarResultado(int idResultado) {
		Resultado resultado =dao.findById(idResultado);
		if(resultado!=null){
			dao.deleteById(idResultado);			
		}
		return resultado!=null?Optional.of(resultado):Optional.empty();
	}
	public List<Resultado> resultadosPorTematica(String tematica){
		return dao.findByTemática(tematica);
		
	} 

}
