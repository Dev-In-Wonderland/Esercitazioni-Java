package utente;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

import prestito.Prestito;

@Entity
@NamedQuery(name = "Utente.findAll", query = "SELECT u FROM Utente u")

public class Utente implements Serializable{

	public Utente() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nome;
	@Column
	private String cognome;
	@Column
	private String dataNascita;
	@Column
	private int numerotessera;

	private Set<Prestito> prestiti;
	
	
	@ManyToMany(mappedBy = "utente")
	private Prestito prestito;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}

	public int getNumeroTessera() {
		return numerotessera;
	}

	public void setNumeroTessera(int numeroTessera) {
		this.numerotessera = numeroTessera;
	}

	@Override
	public String toString() {
		return "Utente [nome=" + nome + ", cognome=" + cognome + ", dataNascita=" + dataNascita + ", numeroTessera="
				+ numerotessera + "]";
	}

	public Utente(String nome, String cognome, String dataNascita) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
	}

}