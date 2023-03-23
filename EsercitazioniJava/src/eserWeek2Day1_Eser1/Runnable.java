package eserWeek2Day1_Eser1;

import java.util.Arrays;
import java.util.Scanner;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Runnable {

	private static int[] arr = new int [5];

	static Scanner s = new Scanner(System.in);

	static Logger l = LoggerFactory.getLogger(Runnable.class);
	
//	private static boolean cycling = true;
	
	public static void main(String[] args) {
		initArray();
//		while(cycling) {
		while(true) {
			try {				
				inserisci();
			} catch(ExitException e) {
				break;
			} catch(Exception e) {
				l.error("indice inserito non valido");
			}
//			break;
		}
		
		l.debug("END");
			
		
	}
	
	public static void inserisci() throws ExitException, Exception {
		System.out.println("Inserisci la posizione (0 - exit)");
		int x = s.nextInt();
		if(x == 0) {
			throw new ExitException();
//			cycling = false;
		}
		System.out.println("Inserisci un numero");
		int n = s.nextInt();
//		
		try {			
			inserisciNumero(n, x-1);
		}catch(Exception e) {
			throw e; //sconsiglio per questo esercizio
//			l.error("indice inserito" + x + " non valido"); //
//			inserisci();
		}

		System.out.println(Arrays.toString(arr));
	}
	
	public static void initArray() {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	private static void inserisciNumero(int n, int p) throws Exception {
		if(p >= arr.length) {
			throw new Exception("Indice out of bound");
		}
		int[] nuovo = new int[arr.length+1];
		for(int i = 0; i < arr.length; i++) {
			if(i < p) {
				nuovo[i] = arr[i];
			}
			if(i == p) {
				nuovo[i] = n;
			}
			if(i > p) {
				nuovo[i+1] = arr[i];
			}
		}
		
		arr = nuovo;
	}

}

