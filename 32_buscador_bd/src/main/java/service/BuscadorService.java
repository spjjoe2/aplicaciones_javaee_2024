package service;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import model.Resultado;

public class BuscadorService {
	private EntityManager eManager;
	
	public BuscadorService() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("buscador");
		eManager = factory.createEntityManager();
	}
	
	public void altaResultado(Resultado resultado) {
		eManager.persist(resultado);
		EntityTransaction et= eManager.getTransaction();
		et.begin();
		eManager.persist(resultado);
		et.commit();		
	}
	
	public Resultado buscarResultadoPorId(int  idResultado) {
		return eManager.find(Resultado.class, idResultado);
	}
	
	public void eliminarResultado (int idResultado) {
		Resultado resultado = buscarResultadoPorId(idResultado);		 
		EntityTransaction et= eManager.getTransaction();
		et.begin();
		eManager.remove(resultado);
		et.commit();
	}
	
	public List<Resultado> resultadosPorTemática(String tematica){		
		String jpql="Select r from Resultado r where r.tematica=?1";		 
		TypedQuery<Resultado> qr = eManager.createQuery(jpql,Resultado.class);
		qr.setParameter(1,tematica);
		//No hay que hacer casting
		return qr.getResultList();		
	}
	
	public Resultado buscarPorUrl(String url) {
		String jpql="Select r from Resultado r where r.url=url";		 
		TypedQuery<Resultado> qr = eManager.createQuery(jpql,Resultado.class);
		qr.setParameter("url",url);
 
		//Opcion A
		return qr.getResultList().stream()
				.findFirst()
				.orElse(null);
		//Opcion B
		/*try {
			return query.getSingleResult();
		}
		catch(NoResultException ex) {
			return null;
		}
		catch(NonUniqueResultException ex) {
			return query.getResultList().get(0);
		}*/ 
 	
	}
	public void eliminarResultadosPorTematica (String tematica) {
		String jpql ="Delete from Resultado r where r.temática =?1";
	    Query  query = eManager.createQuery(jpql);
	    query.setParameter(1,tematica);
	    EntityTransaction tx =eManager.getTransaction();
	    tx.begin();
	    query.executeUpdate();
	    tx.commit();	    
	}

}
