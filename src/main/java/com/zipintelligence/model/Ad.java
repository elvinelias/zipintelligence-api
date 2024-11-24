package com.zipintelligence.model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the ad database table.
 * 
 */
@Entity
@NamedQuery(name="Ad.findAll", query="SELECT a FROM Ad a")
public class Ad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="ad_image")
	private String adImage;

	@Column(name="ad_text")
	private String adText;

	@Column(name="business_id")
	private int businessId;

	@Column(name="expiry_time")
	private Timestamp expiryTime;

	@Column(name="published_by")
	private int publishedBy;

	@Column(name="published_time")
	private Timestamp publishedTime;

	@Column(name="reviewed_by")
	private int reviewedBy;

	private String status;

	private String title;

	public Ad() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdImage() {
		return this.adImage;
	}

	public void setAdImage(String adImage) {
		this.adImage = adImage;
	}

	public String getAdText() {
		return this.adText;
	}

	public void setAdText(String adText) {
		this.adText = adText;
	}

	public int getBusinessId() {
		return this.businessId;
	}

	public void setBusinessId(int businessId) {
		this.businessId = businessId;
	}

	public Timestamp getExpiryTime() {
		return this.expiryTime;
	}

	public void setExpiryTime(Timestamp expiryTime) {
		this.expiryTime = expiryTime;
	}

	public int getPublishedBy() {
		return this.publishedBy;
	}

	public void setPublishedBy(int publishedBy) {
		this.publishedBy = publishedBy;
	}

	public Timestamp getPublishedTime() {
		return this.publishedTime;
	}

	public void setPublishedTime(Timestamp publishedTime) {
		this.publishedTime = publishedTime;
	}

	public int getReviewedBy() {
		return this.reviewedBy;
	}

	public void setReviewedBy(int reviewedBy) {
		this.reviewedBy = reviewedBy;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}