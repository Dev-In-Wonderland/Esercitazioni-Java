package elementoCatalogo;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import prestito.Prestito;

@Entity
@Table(name = "elemcatalogo")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", discriminatorType = DiscriminatorType.STRING)
@NamedQuery(name = "ElementoCatalogo.findAll", query = "SELECT u FROM ElementoCatalogo u")
public abstract class ElementoCatalogo implements Serializable {

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAnno_pubblicazione() {
		return anno_pubblicazione;
	}

	public void setAnno_pubblicazione(int anno_pubblicazione) {
		this.anno_pubblicazione = anno_pubblicazione;
	}

	public int getNumero_pagine() {
		return numero_pagine;
	}

	public void setNumero_pagine(int numero_pagine) {
		this.numero_pagine = numero_pagine;
	}

	public Prestito getPrestito() {
		return prestito;
	}

	public void setPrestito(Prestito prestito) {
		this.prestito = prestito;
	}

	public void setISBN(String iSBN) {
		isbn = iSBN;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String isbn;
	@Column

	private String titolo;
	@Column

	private int anno_pubblicazione;
	@Column

	private int numero_pagine;
	
	@ManyToMany(mappedBy = "elementoPrestato")
	private Set<Prestito> prestito;

	
	public ElementoCatalogo() {
		super();
	}

	public ElementoCatalogo(String ISBN, String titolo, int anno_pubblicazione, int numero_pagine) {
		this.isbn = ISBN;
		this.titolo = titolo;
		this.anno_pubblicazione = anno_pubblicazione;
		this.numero_pagine = numero_pagine;
	}

	public String getISBN() {
		return isbn;
	}

	public String getTitolo() {
		return titolo;
	}

	public int getAnnoPubblicazione() {
		return anno_pubblicazione;
	}

	public int getNumeroPagine() {
		return numero_pagine;
	}
}