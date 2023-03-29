

	
	
	
	package controller;

	import java.sql.Date;

	import model.Event;
	import model.EventDAO;


	public class MainProject {
		
		public static void main(String[] args) {
		Date data = new Date(2023000l);
		Event festa = new Event("festa  bella", data, "non ci stava", "PRIVATA", 10);
		
		EventDAO.addEvento(festa);
	}
	}
	
	
	
	

