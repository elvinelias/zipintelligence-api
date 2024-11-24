package com.zipintelligence.model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the business_user database table.
 * 
 */
@Entity
@Table(name="business_user")
@NamedQuery(name="BusinessUser.findAll", query="SELECT b FROM BusinessUser b")
public class BusinessUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	//bi-directional many-to-one association to Business
	@ManyToOne
	private Business business;

	//bi-directional many-to-one association to User
	@ManyToOne
	private User user;

	public BusinessUser() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Business getBusiness() {
		return this.business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}