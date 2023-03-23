package eserWeek2Day1_Eser2;

import java.util.Scanner;

public class Runnable {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("inserire i km percorsi");
		double km = s.nextDouble();
		
		while(true) {
			System.out.println("inserire i l consumati");
			double l = s.nextDouble();
			
			try {
				double r = CalcolaConsumo(km, l);
				System.out.println(r + "km/l");
				break;
			} catch(DividedByZeroException e) {
				System.out.println("Impossibile calcolare i 0 litri per " + e.km + "km");
				System.out.println("Reinserire i litri");
			}
		}
		
	}
	
	public static double CalcolaConsumo(double km, double l) throws DividedByZeroException {
		if(l == 0) {
			throw new DividedByZeroException(km);
		}
		double res = km / l;
		return res;
	}

}