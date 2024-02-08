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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userID;
	
	@OneToMany(mappedBy="owner",cascade=CascadeType.ALL)
	@JsonIgnore
	private List<Offre> listOffre;
	
	@Column(name="username")
    private String username;

	@Column(name="email")
    private String email;
	
	@Column(name="password")
    private String password;
	
	@Column(name="adresse")
    private String address;
	
	@Column(name="userType")
    private boolean userType;
	
	@Column(name="isAdmin")
    private boolean isAdmin;
    
    public User() {
    	
    }

	public User(List<Offre> listOffre, String username, String email, String password, String address, boolean userType,
			boolean isAdmin) {
		super();
		this.listOffre = listOffre;
		this.username = username;
		this.email = email;
		this.password = password;
		this.address = address;
		this.userType = userType;
		this.isAdmin = isAdmin;
	}

	/**
	 * @return the userID
	 */
	public int getUserID() {
		return userID;
	}

	/**
	 * @param userID the userID to set
	 */
	public void setUserID(int userID) {
		this.userID = userID;
	}

	/**
	 * @return the listOffre
	 */
	public List<Offre> getlistOffre() {
		return listOffre;
	}

	/**
	 * @param listOffre the listOffre to set
	 */
	public void setlistOffre(List<Offre> listOffre) {
		this.listOffre = listOffre;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the userType
	 */
	public boolean isUserType() {
		return userType;
	}

	/**
	 * @param userType the userType to set
	 */
	public void setUserType(boolean userType) {
		this.userType = userType;
	}

	/**
	 * @return the isAdmin
	 */
	public boolean isAdmin() {
		return isAdmin;
	}

	/**
	 * @param isAdmin the isAdmin to set
	 */
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

    
    
}