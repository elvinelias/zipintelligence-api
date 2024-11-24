package com.zipintelligence.model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;

/**
 * The persistent class for the coupon database table.
 * 
 */
@Entity
@NamedQuery(name="Coupon.findAll", query="SELECT c FROM Coupon c")
public class Coupon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="business_id")
	private int businessId;

	@Column(name="coupon_image")
	private String couponImage;

	@Column(name="coupon_text")
	private String couponText;

	@Column(name="expiry_time")
	private Timestamp expiryTime;

	@Column(name="number_of_uses")
	private int numberOfUses;

	@Column(name="publish_status")
	private String publishStatus;

	@Column(name="published_by")
	private int publishedBy;

	@Column(name="published_time")
	private Timestamp publishedTime;

	@Column(name="reviewed_by")
	private int reviewedBy;

	private String status;

	private String title;

	public Coupon() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBusinessId() {
		return this.businessId;
	}

	public void setBusinessId(int businessId) {
		this.businessId = businessId;
	}

	public String getCouponImage() {
		return this.couponImage;
	}

	public void setCouponImage(String couponImage) {
		this.couponImage = couponImage;
	}

	public String getCouponText() {
		return this.couponText;
	}

	public void setCouponText(String couponText) {
		this.couponText = couponText;
	}

	public Timestamp getExpiryTime() {
		return this.expiryTime;
	}

	public void setExpiryTime(Timestamp expiryTime) {
		this.expiryTime = expiryTime;
	}

	public int getNumberOfUses() {
		return this.numberOfUses;
	}

	public void setNumberOfUses(int numberOfUses) {
		this.numberOfUses = numberOfUses;
	}

	public String getPublishStatus() {
		return this.publishStatus;
	}

	public void setPublishStatus(String publishStatus) {
		this.publishStatus = publishStatus;
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