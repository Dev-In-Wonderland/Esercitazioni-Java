package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import utils.JpaUtil;

public class EventDAO {
	 static EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
	 static EntityManager em= emf.createEntityManager();
	 
	public static void addEvento(Event e) {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		System.out.println("Evento salvato!");
	}

	public static Event findEvento(Long id) {
		em.getTransaction().begin();
		Event e = em.find(Event.class, id);
		em.getTransaction().commit();
		return e;
	}

	public static void updateEvento(Event e) {
		em.getTransaction().begin();
		em.merge(e);
		em.getTransaction().commit();
		System.out.println("Evento modificato:" + findEvento(e.getId()));
	}

	public static void removeEvento(Event e ) {
		em.getTransaction().begin();
		em.remove(e);
		em.getTransaction().commit();
		System.out.println("Evento rimosso:" + findEvento(e.getId()));
	}

	public static List<Event> findAll() {
		Query q = em.createNamedQuery("User.findAll");
		return q.getResultList();
	}

}
