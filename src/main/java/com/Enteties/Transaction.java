package com.Enteties;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="transaction")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int transactionID;
	
	@Column(name="transactionDate")
	private String transactionDate;
	
	@ManyToOne
    @JoinColumn(name = "buyerID", referencedColumnName = "userID")
    private User buyer;
	
	@ManyToOne
    @JoinColumn(name = "sellerID", referencedColumnName = "userID")
    private User seller;
	
	@OneToOne(cascade=CascadeType.ALL)
	private AppelOffre ao;

	
	public Transaction() {
		
	}
	
	public Transaction(String transactionDate, User buyer, User seller, AppelOffre ao) {
		super();
		this.transactionDate = transactionDate;
		this.buyer = buyer;
		this.seller = seller;
		this.ao = ao;
	}

	/**
	 * @return the transactionID
	 */
	public int getTransactionID() {
		return transactionID;
	}

	/**
	 * @param transactionID the transactionID to set
	 */
	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}

	/**
	 * @return the transactionDate
	 */
	public String getTransactionDate() {
		return transactionDate;
	}

	/**
	 * @param transactionDate the transactionDate to set
	 */
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	/**
	 * @return the buyer
	 */
	public User getBuyer() {
		return buyer;
	}

	/**
	 * @param buyer the buyer to set
	 */
	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	/**
	 * @return the seller
	 */
	public User getSeller() {
		return seller;
	}

	/**
	 * @param seller the seller to set
	 */
	public void setSeller(User seller) {
		this.seller = seller;
	}

	/**
	 * @return the offre
	 */
	public AppelOffre getOffre() {
		return ao;
	}

	/**
	 * @param offre the offre to set
	 */
	public void setOffre(AppelOffre offre) {
		this.ao = offre;
	}
	
	
	
}
