package prestito;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import utils.JpaUtil;

public class PrestitoDAO {
	static EntityManager em = JpaUtil.entityManagerFactory.createEntityManager();

    public static void savePrestito(Prestito e) {
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit(); 
        System.out.println("prestito salvato");

    }


    public static void multipleSavePrestito( List<Prestito> el) {
        em.getTransaction().begin();
        el.forEach(e -> em.persist(e));
        em.getTransaction().commit();
        }



    public static Prestito findPrestito(Long id) {
        em.getTransaction().begin();
        Prestito e = em.find(Prestito.class, id);
        em.getTransaction().commit();
        return e;
    }



    public static void removePrestito(Prestito e) {
        em.getTransaction().begin();
        em.remove(e);
        em.getTransaction().commit();
        System.out.println("prestito eliminato!");
    };


    @SuppressWarnings("unchecked")
    public static List<Prestito> prestitiFindAll(){
        Query q = em.createNamedQuery("Prestiti.findAll");
        return (List<Prestito> ) q.getResultList();
    }
    

    public static List<Prestito> findBytesseraNonRestituiti(int tessera) {
em.getTransaction().begin();
		
		TypedQuery<Prestito> query = em.createQuery("SELECT p FROM Prestito p WHERE p.utente.numerotessera like :tessera and p.datafineattuale = null" , Prestito.class);
	    query.setParameter("tessera", tessera);
	    List<Prestito> resultList = query.getResultList();
	    
		em.getTransaction().commit();
	
//		if ( !resultList.isEmpty()) {
//	        for (Prestito p : resultList) {
//	            System.out.println(p);
//	        }
//	    } else {
//	        System.out.println("Nessun risultato trovato per tessera: " + tessera);
//	    }	
		return resultList;
    }
}