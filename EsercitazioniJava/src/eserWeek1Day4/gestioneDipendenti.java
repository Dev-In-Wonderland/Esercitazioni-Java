package eserWeek1Day4;

public class gestioneDipendenti {

	public static void main(String[] args) {
		Dipendente d1 = new Dipendente("FFM123456", Dipartimento.PRODUZIONE);
		d1.stampaDatiDipendente();
		
		d1.setLivello(Livello.DIRIGENTE);
//		d1.livello = Livello.DIRIGENTE;
//		d1.stipendio = d1.calcolaStipendio();
		
		
		double res = Dipendente.calcolaPaga(d1);
		double resTot = Dipendente.calcolaPaga(d1, 5);
		
	}

}
