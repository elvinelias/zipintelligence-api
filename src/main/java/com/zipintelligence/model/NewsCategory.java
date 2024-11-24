package com.zipintelligence.model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the news_category database table.
 * 
 */
@Entity
@Table(name="news_category")
@NamedQuery(name="NewsCategory.findAll", query="SELECT n FROM NewsCategory n")
public class NewsCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String description;

	private String name;

	public NewsCategory() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}