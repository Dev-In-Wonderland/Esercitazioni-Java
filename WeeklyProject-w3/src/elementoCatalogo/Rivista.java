package elementoCatalogo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
public class Rivista extends ElementoCatalogo implements Serializable {

	@Enumerated(EnumType.STRING)
	@Column
	private Periodicita periodicità;


	;

	public Rivista(String ISBN, String titolo, int anno_pubblicazione, int numero_pagine, Periodicita periodicità) {
		super(ISBN, titolo, anno_pubblicazione, numero_pagine);
		this.periodicità = periodicità;
	}

	public Rivista() {
		super();
	}

	public Periodicita getPeriodicita() {
		return periodicità;
	}

	public void setPeriodicita(Periodicita periodicità) {
		this.periodicità = periodicità;
	}



	public String toString() {
		return "Rivista{" + "isbn='" + this.getISBN() + '\'' + ", titolo='" + this.getTitolo() + '\''
				+ ", annoPubblicazione=" + this.getAnnoPubblicazione() + ", numPagine=" + this.getNumeroPagine()
				+ ", periodicita=" + this.getPeriodicita() + '}';
	}
}