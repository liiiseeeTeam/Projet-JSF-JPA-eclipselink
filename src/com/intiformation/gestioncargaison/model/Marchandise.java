package com.intiformation.gestioncargaison.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

@Entity(name = "marchandises")
@Table(name = "marchandise")
public class Marchandise implements Serializable{
	
	/*__________________________props__________________________*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "id_marchandise")
	private Long numero;
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "poids")
	private double poids;
	
	@Column(name = "volume")
	private double volume;
	
	/*association entre Marchandise et Cargaison*/
	@ManyToOne
	@JoinColumn(name = "CARGAISON_ID", referencedColumnName = "id_reference")
	private Cargaison cargaison;
	
	
	/*__________________________ctors__________________________*/
	
	public Marchandise() {
	}

	//ctor chargé
	public Marchandise(Long numero, String nom, double poids, double volume) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.poids = poids;
		this.volume = volume;
	}

	//ctor sans l'id
	public Marchandise(String nom, double poids, double volume) {
		super();
		this.nom = nom;
		this.poids = poids;
		this.volume = volume;
	}

	
	/*__________________________getters/setters__________________________*/
	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public Cargaison getCargaison() {
		return cargaison;
	}

	public void setCargaison(Cargaison cargaison) {
		this.cargaison = cargaison;
	}
	
	
	
	
	
	

}
