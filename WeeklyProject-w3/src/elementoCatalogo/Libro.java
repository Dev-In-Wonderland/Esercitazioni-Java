package elementoCatalogo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Libro extends ElementoCatalogo implements Serializable {

	@Column
	private String autore;
	@Column

	private String genere;

	public Libro(String ISBN, String titolo, int anno_pubblicazione, int numero_pagine, String autore, String genere) {
		super(ISBN, titolo, anno_pubblicazione, numero_pagine);
		this.autore = autore;
		this.genere = genere;
	}

	public Libro() {
		super();
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public String getAutore() {
		return autore;
	}

	public String getGenere() {
		return genere;
	}

	public String toString() {
		return "Libro{" + "isbn='" + this.getISBN() + '\'' + ", titolo='" + this.getTitolo() + '\''
				+ ", annoPubblicazione=" + this.getAnnoPubblicazione() + ", numPagine=" + this.getNumeroPagine()
				+ ", autore='" + this.getAutore() + '\'' + ", genere='" + this.getGenere() + '\'' + '}';
	}
}