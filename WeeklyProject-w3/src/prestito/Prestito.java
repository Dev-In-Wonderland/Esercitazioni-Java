package prestito;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import elementoCatalogo.ElementoCatalogo;
import utente.Utente;

@Entity
@Table(name = "prestiti")
@NamedQuery(name = "Prestiti.findAll", query = "SELECT u FROM Prestito u")
public class Prestito implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToMany
	@JoinColumn(name = "prestito_utente")
	private Set<Utente> utente;

	@ManyToMany
	@JoinColumn(name = "prestito_elementoprestato")
	private Set<ElementoCatalogo> elementoPrestato;

	@Column
	private LocalDate dataInizio;

	@Column
	private LocalDate dataFinePrevista;

	@Column
	private LocalDate datafineattuale;

	public Prestito() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Set<Utente> getUtente() {
		return utente;
	}


	public void setUtente(Set<Utente> utente) {
		this.utente = utente;
	}


	public Set<ElementoCatalogo> getElementoPrestato() {
		return elementoPrestato;
	}


	public void setElementoPrestato(Set<ElementoCatalogo> elementoPrestato) {
		this.elementoPrestato = elementoPrestato;
	}


	public LocalDate getDatafineattuale() {
		return datafineattuale;
	}


	public void setDatafineattuale(LocalDate datafineattuale) {
		this.datafineattuale = datafineattuale;
	}


	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
		this.dataFinePrevista= dataInizio.plusDays(30l);
	}

	public LocalDate getDataFinePrevista() {
		return dataFinePrevista;
	}

	public void setDataFinePrevista(LocalDate dataFinePrevista) {
		this.dataFinePrevista = dataFinePrevista;
	}

	public LocalDate getDataFineAttuale() {
		return datafineattuale;
	}

	public void setDataFineAttuale(LocalDate dataFineAttuale) {
		this.datafineattuale = dataFineAttuale;
	}

	@Override
	public String toString() {
		return "Prestito [utente=" + utente + ", elementoPrestato=" + elementoPrestato + ", dataInizio=" + dataInizio
				+ ", dataFinePrevista=" + dataFinePrevista + ", dataFineAttuale=" + datafineattuale + "]";
	}

	public Prestito(Utente utente, ElementoCatalogo elementoPrestato, LocalDate dataInizio, LocalDate dataFineAttuale) {
		super();
		this.utente = (Set<Utente>) utente;
		this.elementoPrestato = (Set<ElementoCatalogo>) elementoPrestato;
		this.dataInizio = dataInizio;
		this.datafineattuale = dataFineAttuale;

	}

}