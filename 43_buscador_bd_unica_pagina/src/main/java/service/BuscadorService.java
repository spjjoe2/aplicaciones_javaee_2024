package service;

import java.util.List;
import java.util.Optional;

import dao.BuscadorDao;
import model.Resultado;

public class BuscadorService {
	
	BuscadorDao dao=new BuscadorDao();
	//si la url no está siendo utilizada por otro resultado, se dará de alta
	public boolean altaResultado(Resultado resultado) {
		if(dao.findByUrl(resultado.getUrl())==null) {
			dao.save(resultado);
			return true;
		}
		return false;
		
	}
	
	public Optional<Resultado> buscarResultadoPorId(int idResultado) {
		Resultado resultado=dao.findById(idResultado);
		return resultado!=null?Optional.of(resultado):Optional.empty();
	}
	public Optional<Resultado> eliminarResultado(int idResultado) {
		Resultado resultado=dao.findById(idResultado);
		if(resultado!=null) {
			dao.deleteById(idResultado);
		}
		return resultado!=null?Optional.of(resultado):Optional.empty();
		
	}
	public List<Resultado> resultadosPorTematica(String tematica){
		return dao.findByTematica(tematica);
	}
	
	
	
}
