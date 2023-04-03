package elementoCatalogo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import utils.JpaUtil;

public class ElementoCatalogoDAO {

	
	static EntityManager em = JpaUtil.entityManagerFactory.createEntityManager();

    public static void saveElementoCatalogo(ElementoCatalogo e) {
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit(); 
        System.out.println("elemento catalogo salvato");

    }


    public static void multipleSaveElementoCatalogo(List<ElementoCatalogo> el) {
        em.getTransaction().begin();
        el.forEach(e -> em.persist(e));
        em.getTransaction().commit();
        }



    public static ElementoCatalogo findElementoCatalogo(Long id) {
        em.getTransaction().begin();
        ElementoCatalogo e = em.find(ElementoCatalogo.class, id);
        em.getTransaction().commit();
        return e;
    }



    public static void removeElementoCatalogo(ElementoCatalogo e) {
        em.getTransaction().begin();
        em.remove(e);
        em.getTransaction().commit();
        System.out.println("elemento catalogo eliminato!");
    };


    
    @SuppressWarnings("unchecked")
	public static List<ElementoCatalogo> ElementoCatalogoFindAll(){
        Query q = em.createNamedQuery("ElementoCatalogofindAll");
        List<ElementoCatalogo> resultList = q.getResultList();
        return  resultList;
    }
    public static ElementoCatalogo serchByIsbn(String isbnToRemove) {
		em.getTransaction().begin();
		
		TypedQuery<ElementoCatalogo> query = em.createQuery("SELECT p FROM ElementoCatalogo p WHERE p.isbn = :isbn", ElementoCatalogo.class);
	    query.setParameter("isbn", isbnToRemove);
	    ElementoCatalogo result = query.getSingleResult();
	    
	    em.getTransaction().commit();
	   
	    return result;}
	
	
	public static List<ElementoCatalogo> searchByYearDate(int year) {
		em.getTransaction().begin();
		
		TypedQuery<ElementoCatalogo> query = em.createQuery("SELECT p FROM ElementoCatalogo p WHERE p.anno_pubblicazione = :year", ElementoCatalogo.class);
	    query.setParameter("year", year);
	    List<ElementoCatalogo> resultList = query.getResultList();
	    
	    em.getTransaction().commit();
	
		return resultList;
		
	}
	
	public static List<ElementoCatalogo> searchByAutore(String autore) {
		em.getTransaction().begin();
		
		TypedQuery<ElementoCatalogo> query = em.createQuery("SELECT p FROM ElementoCatalogo p WHERE p.autore = :autore", ElementoCatalogo.class);
	    query.setParameter("autore", autore);
	    List<ElementoCatalogo> resultList = query.getResultList();/*getSingleResult() per cercare solo il primo elemento*/
	    
		em.getTransaction().commit();
		return resultList;
	}
	
	public static void searchByTitolo(String titolo) {
		em.getTransaction().begin();
		
		TypedQuery<ElementoCatalogo> query = em.createQuery("SELECT p FROM ElementoCatalogo p WHERE p.titolo like :titolo", ElementoCatalogo.class);
	    query.setParameter("titolo", '%' + titolo + '%');
	    List<ElementoCatalogo> resultList = query.getResultList();
	    
		em.getTransaction().commit();
		if (resultList != null && !resultList.isEmpty()) {
	        for (ElementoCatalogo p : resultList) {
	            System.out.println(p.toString());
	        }
	    } else {
	        System.out.println("Nessun risultato trovato per titolo: " + titolo);
	    }
	}
	

	

}