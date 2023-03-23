package eserWeek1Day1;

public class Test {

	
	public static void main(String args[]) {
		
		test();
		
//		System.out.println("Hello world");
//		
//		//VARIABILI
//		
//		int x;//dichiarazione
//		x = 10; //assegnazione
//		
//		System.out.println(x);
//		
//		//Numeri
//		int t = 10;//per i nuemri interi
//		short y = 5; //per numeri piccoli
//		//per gli id o altri valori n umerici grandi
//		long z = 5l; //per numeri grandi
//		
//		//float f = 10.123456f; //decimale preciso e pesante, di solito usato per i risultati e non per valori assoluti
//		double d = 2.5; //decimali pecisione 2 decimali
//		
//		//final -> const
//		final int w = 100;
//		
//		//Stringhe
//		//char c = 'F';
//		String s = "Stringa";
//		System.out.println(s);
//		
//		//Boolean
//		boolean b = true;
//		
////		float fl = f(5f);
//
//		//Operatori
//		//aritmetici + - * / %
//		x = x + t;
//		s = s + "!";
//		s = s + x;
//		
//		z = z + y;
////		y = z + y;
//		
//
//		//relazioni != == < > <= >=
//		boolean res = y > z;
//		
//		
//		//logici && || ! ^
//		boolean and = res && b;
//		
//		//boolean vb = x;
//		//int non sono convertibili natuarlmente in boolean
//		
//		
//		
//		int a[] = new int [5];
//		a[0] = 10;
//		
//		String arr[] = {"a", "b", "c"};
//
//		System.out.println(arr);
//		
//		//int[][] matrix = new int[3][10];
//		
//		System.out.print(arr.length);
//		
//		int a2[] = new int [arr.length + 1];
////		a2[0] = arr[0];
//		
////		for(int i = 0; i < a2.length; i++) {
////			
////		}
//		
//		
//		//per leggere la tipologia Object.getClass()
//		int xx = 10;
//		System.out.println( ((Object) xx).getClass().getSimpleName());
//		
//		
//		long yy = (long) xx;
//		
//		System.out.println("SOMMA:" + somma(4, 5));
//		
//		
//		//Lettura input utente
//		Scanner sc = new Scanner(System.in);
//		
//		//sc.nextLine(); //testi
//		//sc.nextInt(); //singolo valore
//		System.out.print("Inserire il numero");
//		
//		int g = sc.nextInt();
//		
//		System.out.print(g);
		
	}
	
	private static int somma(int x, int y) {
		return x + y;
	}
	
	private int meta(int n) {
		return n/2;
	}
	
	public int calcolo(int a, int b) {
		return meta(somma(a, b));
	}
	
	public static void test() {
		String s = "Stringa";
		int a = 5;
		int b = 10;
		System.out.print( s + a + b + "!" );
	}
	
//	static float f(float x) {
//		return x / 1.67d;
//	}
	
	
}
