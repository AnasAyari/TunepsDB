package com.Enteties;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

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
import jakarta.persistence.Table;

@Entity
@Table(name="offre")
public class Offre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int offreID;
	
	@Column(name="numConsultation")
	private String numConsultation;
	
	@Column(name="numReference")
	private String numReference;
	
	@Column(name="datePublication")
	private String datePublication;
	
	@Column(name="objetConsultation")
	private String objetConsultaion;
	
	@Column(name="status")
	private boolean status;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "aoID", referencedColumnName = "numAO")
	
    private AppelOffre appelOffre;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ownerID", referencedColumnName = "userID")
    
    private User owner;
    
    
    
    
    
    public Offre() {
    	
    }

	public Offre(String numConsultation, String numReference, String datePublication, String objetConsultaion,
			boolean status, AppelOffre appelOffre, User owner) {
		super();
		this.numConsultation = numConsultation;
		this.numReference = numReference;
		this.datePublication = datePublication;
		this.objetConsultaion = objetConsultaion;
		this.status = status;
		this.appelOffre = appelOffre;
		this.owner = owner;
	}

	
	
	/**
	 * @return the offreID
	 */
	public int getOffreID() {
		return offreID;
	}

	/**
	 * @param offreID the offreID to set
	 */
	public void setOffreID(int offreID) {
		this.offreID = offreID;
	}

	/**
	 * @return the numConsultation
	 */
	public String getNumConsultation() {
		return numConsultation;
	}

	/**
	 * @param numConsultation the numConsultation to set
	 */
	public void setNumConsultation(String numConsultation) {
		this.numConsultation = numConsultation;
	}

	/**
	 * @return the numReference
	 */
	public String getNumReference() {
		return numReference;
	}

	/**
	 * @param numReference the numReference to set
	 */
	public void setNumReference(String numReference) {
		this.numReference = numReference;
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
	 * @return the objetConsultaion
	 */
	public String getObjetConsultaion() {
		return objetConsultaion;
	}

	/**
	 * @param objetConsultaion the objetConsultaion to set
	 */
	public void setObjetConsultaion(String objetConsultaion) {
		this.objetConsultaion = objetConsultaion;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * @return the appelOffre
	 */
	public AppelOffre getAppelOffre() {
		return appelOffre;
	}

	/**
	 * @param appelOffre the appelOffre to set
	 */
	public void setAppelOffre(AppelOffre appelOffre) {
		this.appelOffre = appelOffre;
	}

	/**
	 * @return the owner
	 */
	public User getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(User owner) {
		this.owner = owner;
	}
	
	
	
    
}	
