package eserWeek1Day2;

public class Rettangolo {
	double lato_uno;
	double lato_due;
	double a;
	double p;
public Rettangolo( double lato_uno,double lato_due) {
	this.lato_uno=lato_uno;
	this.lato_due=lato_due;
}
public void area( ) {
	 this.a=lato_uno*lato_due;
	 this.p=lato_uno*2 + lato_due*2;
	System.out.println("area = "+ a +" perimetro= "+p);
}

}