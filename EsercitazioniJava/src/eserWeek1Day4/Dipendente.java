package eserWeek1Day4;

public class Dipendente {
	private static double stipendioBase;
	
	private String matricola;
	private double importoOrarioStraordinario;
	private Livello livello;
	private Dipartimento dipartimento;
	private double stipendio;
	
	
	public Dipendente(String m, Dipartimento d) {
		this.matricola = m;
		this.dipartimento = d;
		this.importoOrarioStraordinario = 30;
		this.livello = Livello.OPERAIO;
		this.stipendio = 1000;
	}
	
	public Dipendente(
			String m,
			double stra,
			Livello l,
			Dipartimento d) {
		this(m, d);
//		this.matricola = m;
//		this.dipartimento = d;
		this.importoOrarioStraordinario = stra;
//		this.livello = l;
//		this.stipendio = s;	
		this.setLivello(l);
	}

	void stampaDatiDipendente(){
//		System.out.println(this.toString());
		System.out.println(this);
	}
	
	public String toString() {
		return "Dipendente: " + this.matricola
				+ "\nlivello: " + this.livello
				+ "\ndipartimento: " + this.dipartimento
				+ "\nstipendio: " + this.stipendio
				+"\n\n";
	}
	
	public Livello promuovi() {
		switch(this.livello) {
			case OPERAIO:
//				this.livello = Livello.IMPIEGATO;
				this.setLivello(Livello.IMPIEGATO);
				break;
			case IMPIEGATO:
				this.setLivello(Livello.QUADRO);
				break;
			case QUADRO:
				this.setLivello(Livello.DIRIGENTE);
				break;
			default:
				System.out.println("Errore, già dirigente");
				break;
		}
		
		return this.livello;
	}
	
	public double calcolaStipendio() {
		double coeff = 1;
		switch(this.livello) {
			case OPERAIO:
				coeff = 1;
				break;
			case IMPIEGATO:
				coeff = 1.2;
				break;
			case QUADRO:
				coeff = 1.5;
				break;
			case DIRIGENTE:
				coeff = 2;
				break;
			default:
				break;
		}
		return coeff * Dipendente.stipendioBase;
	}
	
	public double getStipendio() {
		return this.calcolaStipendio();
		//se volessi non avere stipendio come proprietà potrei usare questo metodo per calcolarmenlo ogni volta
	}
	
	public void setLivello(Livello l) {
		this.livello = l;
		this.stipendio = this.calcolaStipendio();
	}
	
	public void setDipartimento(Dipartimento d) {
		this.dipartimento = d;
	}
	
	static double calcolaPaga(Dipendente d) {
		return d.stipendio;
	}
	
	static double calcolaPaga(Dipendente d, int h) {
		return d.stipendio + d.importoOrarioStraordinario * h;
	}
	

}