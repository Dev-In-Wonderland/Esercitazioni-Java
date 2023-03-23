package eserWeek2Day3;

public class Main {

	public static void main(String[] args) {
		
		int[] array = new int[300000];
		//popolo
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100) + 1;
		}
		//divido in 3
		int[] a1 = new int[100000];
		int[] a2 = new int[100000];
		int[] a3 = new int[100000];
		for(int i = 0; i < a1.length; i++) {
			a1[i] = array[i];
			a2[i] = array[i+100000];
			a3[i] = array[i+200000];
		}
		
		
		long start = System.nanoTime();
		
		//somma
//		int tot1 = 0;
//		int tot2 = 0;
//		int tot3 = 0;
//		for(int i = 0; i < a1.length; i++) {
//			tot1 += a1[i];
//			tot2 += a1[i];
//			tot3 += a1[i];
//		}
//		

		
		ArrayCalculator ac1 = new ArrayCalculator(a1);
		ArrayCalculator ac2 = new ArrayCalculator(a2);
		ArrayCalculator ac3 = new ArrayCalculator(a3);
		
		//Blocking
//		ac1.run();
//		ac2.run();
//		ac3.run();
		//4995391 nanosec
		
		//Multithread - 10595275 nanosec
		Thread t1 = new Thread(ac1);
		Thread t2 = new Thread(ac2);
//		//il terzo thread è queto main che non deve fare altro nel frattempo
//		
//		
		t1.start();
		t2.start();
		ac3.run(); //blocking - non andiamo avanti finchè non abbiamo temrinato il conto
////		
////		
		try {
			t1.join();
			t2.join();
			int tot = ac1.getTotale() + ac2.getTotale() + ac3.getTotale();
			System.out.println(tot);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		
		
		
		
		//
//		int tot = tot1 + tot2 + tot3;
		
		long end = System.nanoTime();
		
		System.out.println(end - start);
		
		
		
		
	}

	
	
	
	
}