package com.zipintelligence.model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the franchise_user database table.
 * 
 */
@Entity
@Table(name="franchise_user")
@NamedQuery(name="FranchiseUser.findAll", query="SELECT f FROM FranchiseUser f")
public class FranchiseUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	//bi-directional many-to-one association to Franchise
	@ManyToOne
	private Franchise franchise;

	//bi-directional many-to-one association to User
	@ManyToOne
	private User user;

	public FranchiseUser() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Franchise getFranchise() {
		return this.franchise;
	}

	public void setFranchise(Franchise franchise) {
		this.franchise = franchise;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}