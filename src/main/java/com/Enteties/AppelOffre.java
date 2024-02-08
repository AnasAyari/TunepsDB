package com.Enteties;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="appeloffre")
public class AppelOffre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numAO;
	
	@OneToMany(mappedBy="appelOffre",cascade=CascadeType.ALL)
	@JsonIgnore
	private List<Offre> listOffre;
	
	@OneToOne(fetch = FetchType.EAGER, mappedBy = "ao")
	@JsonIgnore
    private Transaction transaction;
	
	@Column(name="type")
	private String type;
	
	@Column(name="nouvelInsertion")
	private String nouvelInsertion;
	
	@Column(name="enLigne")
	private boolean enLigne;
	
	@Column(name="objetAO")
	private String objetAO;
	
	@Column(name="datePublication")
	private String datePublication;
	
	@Column(name="dateFin")
	private String dateFin;
	
	@Column(name="lieuOuverture")
	private String lieuOuverture;
	
	@Column(name="nomAcheteur")
	private String nomAcheteur;
	

	
	
	public AppelOffre() {
		
	}




	public AppelOffre(List<Offre> listOffre, String type, String nouvelInsertion, boolean enLigne, String objetAO,
			String datePublication, String dateFin, String lieuOuverture, String nomAcheteur) {
		super();
		this.listOffre = listOffre;
		this.type = type;
		this.nouvelInsertion = nouvelInsertion;
		this.enLigne = enLigne;
		this.objetAO = objetAO;
		this.datePublication = datePublication;
		this.dateFin = dateFin;
		this.lieuOuverture = lieuOuverture;
		this.nomAcheteur = nomAcheteur;
	}




	/**
	 * @return the numAO
	 */
	public int getNumAO() {
		return numAO;
	}




	/**
	 * @param numAO the numAO to set
	 */
	public void setNumAO(int numAO) {
		this.numAO = numAO;
	}




	/**
	 * @return the listOffre
	 */
	public List<Offre> getListOffre() {
		return listOffre;
	}




	/**
	 * @param listOffre the listOffre to set
	 */
	public void setListOffre(List<Offre> listOffre) {
		this.listOffre = listOffre;
	}




	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}




	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}




	/**
	 * @return the nouvelInsertion
	 */
	public String getNouvelInsertion() {
		return nouvelInsertion;
	}




	/**
	 * @param nouvelInsertion the nouvelInsertion to set
	 */
	public void setNouvelInsertion(String nouvelInsertion) {
		this.nouvelInsertion = nouvelInsertion;
	}




	/**
	 * @return the enLigne
	 */
	public boolean isEnLigne() {
		return enLigne;
	}




	/**
	 * @param enLigne the enLigne to set
	 */
	public void setEnLigne(boolean enLigne) {
		this.enLigne = enLigne;
	}




	/**
	 * @return the objetAO
	 */
	public String getObjetAO() {
		return objetAO;
	}




	/**
	 * @param objetAO the objetAO to set
	 */
	public void setObjetAO(String objetAO) {
		this.objetAO = objetAO;
	}




	/**
	 * @return the datePublication
	 */
	public String getDatePublication() {
		return datePublication;
	}




	/**
	 * @param datePublication the datePublication to set
	 */
	public void setDatePublication(String datePublication) {
		this.datePublication = datePublication;
	}




	/**
	 * @return the dateFin
	 */
	public String getDateFin() {
		return dateFin;
	}




	/**
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}




	/**
	 * @return the lieuOuverture
	 */
	public String getLieuOuverture() {
		return lieuOuverture;
	}




	/**
	 * @param lieuOuverture the lieuOuverture to set
	 */
	public void setLieuOuverture(String lieuOuverture) {
		this.lieuOuverture = lieuOuverture;
	}




	/**
	 * @return the nomAcheteur
	 */
	public String getNomAcheteur() {
		return nomAcheteur;
	}




	/**
	 * @param nomAcheteur the nomAcheteur to set
	 */
	public void setNomAcheteur(String nomAcheteur) {
		this.nomAcheteur = nomAcheteur;
	}
	
	
	
}