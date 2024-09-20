package dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import model.Resultado;

public class BuscadorDao {
	
	private static EntityManager eManager;
	
	static {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("buscador");
		eManager = factory.createEntityManager();
	}

	public void save(Resultado resultado) {
		 
		EntityTransaction et= eManager.getTransaction();
		et.begin();
		eManager.persist(resultado);
		et.commit();		
	}
	
	public Resultado findByUrl(String url) {
		String jpql="Select r from Resultado r where r.url=url";		 
		TypedQuery<Resultado> qr = eManager.createQuery(jpql,Resultado.class);
		qr.setParameter("url",url);
  
		return qr.getResultList().stream()
				.findFirst()
				.orElse(null);
	}
	
	public Resultado findById(int  idResultado) {
		return eManager.find(Resultado.class, idResultado);
	}
	
	public void deleteById(int idResultado) { 
		eManager.remove(findById(idResultado));	 
	}
	
	public List<Resultado> findByTemática(String tematica){		
		String jpql="Select r from Resultado r where r.tematica=?1";		 
		TypedQuery<Resultado> qr = eManager.createQuery(jpql,Resultado.class);
		qr.setParameter(1,tematica);
		//No hay que hacer casting
		return qr.getResultList();		
	}
	
	
	

}
