package eserWeek1Day2;

public class Sim {
private int numero;
private double  credito;
private int[] ultimeChiamate = new int[5];

public Sim(int numero ) {
	this.numero=numero;
	this.credito=0;
	this.ultimeChiamate = new int[]{ 0,0,0,0,0 };	
}

public void get() {
	System.out.println("numero: "+numero +" credito: "+ credito+" ultime chiamate:" + ultimeChiamate );
	
}
}