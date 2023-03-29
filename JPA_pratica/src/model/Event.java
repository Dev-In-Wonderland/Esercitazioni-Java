package model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "eventi")
@NamedQuery(name = "eventi.findAll", query = "SELECT u FROM Event u")
public class Event implements Serializable{
	private LocalDate data;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)

	private String titolo;
	@Column(nullable = false)

	private String descrizione;
	@Column(nullable = false)

	private String tipo;
	@Column(nullable = false)

	private Integer numeromax;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getNumeromax() {
		return numeromax;
	}

	public void setNumeromax(Integer numeromax) {
		this.numeromax = numeromax;
	}

	@Override
	public String toString() {
		return "Evento [id=" + id + ", titolo=" + titolo + ", data=" + data + ", descrizione=" + descrizione + ", tipo="
				+ tipo + ", numeromax=" + numeromax + "]";
	}

	public Event(Long id, String titolo, LocalDate data, String descrizione, String tipo, Integer numeromax) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.data = data;
		this.descrizione = descrizione;
		this.tipo = tipo;
		this.numeromax = numeromax;
	}

	public Event(String titolo, LocalDate data, String descrizione, String tipo, Integer numeromax) {
		super();
		this.titolo = titolo;
		this.data = data;
		this.descrizione = descrizione;
		this.tipo = tipo;
		this.numeromax = numeromax;
	}
}