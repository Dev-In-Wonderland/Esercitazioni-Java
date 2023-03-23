package eserWeek2Day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class eser3 {
	
	private static Scanner s = new Scanner(System.in);
	
	private static Map<String, Long> rubrica = new HashMap<String, Long>();

	public static void main(String[] args) {
		
//		try {
//			inserimento("Flavio", 1234567890l);
//		} catch(Exception e) {
//			
//		}
		inserimento("user1", 1234567890l);
		inserimento("user2", 2345678901l);
		inserimento("user3", 3456789012l);
		
		Long num2 = rimuovi("user2");
		
	}
	
	private static void inserimento(String nome, Long numero) {
		if(rubrica.containsKey(nome)) {
			System.out.println("Nome già presente con il numero " + rubrica.get(nome) +".\nVuoi sovrascrivere il numero? [Y/n]");
//			char res = s.next().charAt(0);
//			if(res == 'Y') {
//				
//			}
			String res = s.nextLine();
			if(res.toUpperCase().equals("Y")) {
				rubrica.put(nome, numero);
			} 
//			else {
//				throw new Exception("Nome già presente");
//			}
		}
//		Long prevNumber = rubrica.put(nome, numero);
//		if(prevNumber != null) {
////			
//		}
	}
	
	public static Long rimuovi(String nome) {
//		Long res = rubrica.remove(nome);
//		if(res == null ) return 0l;
//		return res;
		return rubrica.remove(nome);
	}
	
	public static String cercaPersonaPerNumero(Long num) {
		Set<String> keys = rubrica.keySet();
		for(String k : keys) {
			Long n = rubrica.get(k);
			if(n == num) {
				return k;
			}
		}
		System.out.println("Numero non trovato");
		return null;
	}
	
	public static List<String> cercaPersonePerNumero(Long num) {
		List<String> persone = new ArrayList<String>();
		Set<String> keys = rubrica.keySet();
		for(String k : keys) {
			Long n = rubrica.get(k);
			if(n == num) {
				persone.add(k);
			}
		}
		
		return persone;
	}
	
	
	public static String cercaPersonaPerNumeroPick(Long num) {
		List<String> persone = new ArrayList<String>();
		Set<String> keys = rubrica.keySet();
		for(String k : keys) {
			Long n = rubrica.get(k);
			if(n == num) {
				persone.add(k);
			}
		}
		if(persone.size() == 0) {
//			throw new Exception("Not found");
			return null;
		}
		if(persone.size() == 1) {
			return persone.get(0);
		}
		System.out.println("Sono stati trovate " + persone.size() + " persone. Quale vuoi leggere? [1 -  " + persone.size() + "]");
		int pos = s.nextInt();
		//controlli
		return persone.get(pos);
	}
	
	
	
	///////////
	public String getPersona(Long num) {
		Set<Entry<String, Long>> entries = rubrica.entrySet();
		for(Entry<String, Long> e : entries) {
			if(e.getValue() == num) {
				return e.getKey();
			}
		}
		return null;
	}
	
	
	
	

}