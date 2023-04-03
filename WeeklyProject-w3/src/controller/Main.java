
	
	
	package controller;
	import java.util.List;
	import java.util.Scanner;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;

	import elementoCatalogo.ElementoCatalogo;
	import elementoCatalogo.ElementoCatalogoDAO;
	import elementoCatalogo.Libro;
	import elementoCatalogo.Rivista;
	import prestito.*;


	


	public class Main {
		
		static EntityManagerFactory emf = Persistence.createEntityManagerFactory("development_3");
		static EntityManager em = emf.createEntityManager();

	    public static <Elemento> void main(String[] args) {

	        Scanner input = new Scanner(System.in);

	        while (true) {
	            System.out.println("Scegli un'opzione:");
	            System.out.println("1. Aggiungi libro");
	            System.out.println("2. Aggiungi rivista");
	            System.out.println("3. Rimuovi elemento dato un codice ISBN");
	            System.out.println("4. Ricerca per ISBN");
	            System.out.println("5. Ricerca per anno pubblicazione");
	            System.out.println("6. Ricerca per autore");
	            System.out.println("7. Stampa tutti gli elementi del catalogo");
	            System.out.println("0. Esci dal programma");


	            int scelta = input.nextInt();
	            input.nextLine();


	            switch (scelta) {
	                case 1:
	                    System.out.println("Inserisci i dati del libro:");
	                    System.out.print("ISBN: ");
	                    String isbn = input.nextLine();
	                    System.out.print("Titolo: ");
	                    String titolo = input.nextLine();
	                    System.out.print("Anno pubblicazione: ");
	                    int anno = input.nextInt();
	                    input.nextLine();
	                    System.out.print("Numero pagine: ");
	                    int pagine = input.nextInt();
	                    input.nextLine();
	                    System.out.print("Autore: ");
	                    String autore = input.nextLine();
	                    System.out.print("Genere: ");
	                    String genere = input.nextLine();

	                    Libro libro = new Libro(isbn, titolo, anno, pagine, autore, genere);


	                    ElementoCatalogoDAO.saveElementoCatalogo(libro);
	                    break;

	                case 2:
	                    System.out.println("Inserisci i dati della rivista:");
	                    System.out.print("ISBN: ");
	                    String isbnR = input.nextLine();
	                    System.out.print("Titolo: ");
	                    String titoloR = input.nextLine();
	                    System.out.print("Anno pubblicazione: ");
	                    int annoR = input.nextInt();
	                    input.nextLine();
	                    System.out.print("Numero pagine: ");
	                    int pagineR = input.nextInt();
	                    input.nextLine();
	                    System.out.print("Periodicità (SETTIMANALE, MENSILE o SEMESTRALE): ");
	                    String periodicità = input.nextLine().toUpperCase();

	                    Rivista rivista = new Rivista(isbnR, titoloR, annoR, pagineR, periodicità);
	                    ElementoCatalogoDAO.saveElementoCatalogo(rivista);
	                    break;

	                case 3:
	                    System.out.print("Inserisci il codice ISBN dell'elemento da rimuovere: ");
	                    String isbnToRemove = input.nextLine();
	                    ElementoCatalogoDAO.removeElementoCatalogo(ElementoCatalogoDAO.searchByIsbn(isbnToRemove));
	                    break;

	                case 4:
	                    System.out.print("Inserisci il codice ISBN dell'elemento da cercare: ");
	                    String isbnToFind = input.nextLine();
	                   ElementoCatalogo risultatoISBN = ElementoCatalogoDAO.searchByIsbn(isbnToFind);
	                    if (risultatoISBN == null) {
	                        System.out.println("Elemento non trovato");
	                    } else {
	                        System.out.println(risultatoISBN);
	                    }
	                    break;

	                case 5:
	                    System.out.print("Inserisci l'anno di pubblicazione: ");
	                    int anno2 = input.nextInt();
	                    input.nextLine();

	                    List<ElementoCatalogo> elementiPerAnno = ElementoCatalogoDAO.searchByYearDate(anno2);
	                    if (elementiPerAnno.size() > 0) {
	                        System.out.println("Elementi pubblicati nell'anno " + anno2 + ":");
	                        for (ElementoCatalogo e : elementiPerAnno) {
	                            System.out.println(e.toString());
	                        }
	                    } else {
	                        System.out.println("Nessun elemento trovato pubblicato nell'anno " + anno2);
	                    }
	                    break;

	                case 6:
	                    System.out.print("Inserisci l'autore: ");
	                    String autore2 = input.nextLine();

	                    List<ElementoCatalogo> elementiPerAutore = ElementoCatalogoDAO.searchByAutore(autore2);
	                    if (elementiPerAutore.size() > 0) {
	                        System.out.println("Elementi dell'autore " + autore2 + ":");
	                        for (ElementoCatalogo e : elementiPerAutore) {
	                            System.out.println(e.toString());
	                        }
	                    } else {
	                        System.out.println("Nessun elemento trovato dell'autore " + autore2);
	                    }
	                    break;

	              
	                case 7:
	                	List<ElementoCatalogo> all = ElementoCatalogoDAO.ElementoCatalogoFindAll();
	                	if (all.size() > 0) {
	                        System.out.println("Tutti gli elementi del catalogo");
	                        for (ElementoCatalogo e : all) {
	                            System.out.println(e.toString());
	                        }
	                    } else {
	                        System.out.println("Nessun elemento trovato ");
	                    }
	                	
	                    break;
	                case 0:
	                    System.out.println("Uscita dal programma...");
	                    System.exit(0);
	                    break;

	                default:
	                    System.out.println("Scelta non valida.");
	                    break;
	            }

	        }
	    }
	}

}
