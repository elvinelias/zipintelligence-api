package com.zipintelligence.model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the news_item database table.
 * 
 */
@Entity
@Table(name="news_item")
@NamedQuery(name="NewsItem.findAll", query="SELECT n FROM NewsItem n")
public class NewsItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="expiry_time")
	private Timestamp expiryTime;

	@Column(name="news_category_id")
	private int newsCategoryId;

	@Column(name="news_image")
	private String newsImage;

	@Column(name="news_text")
	private String newsText;

	@Column(name="published_by")
	private int publishedBy;

	@Column(name="published_time")
	private Timestamp publishedTime;

	@Column(name="reviewed_by")
	private int reviewedBy;

	private String title;

	public NewsItem() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getExpiryTime() {
		return this.expiryTime;
	}

	public void setExpiryTime(Timestamp expiryTime) {
		this.expiryTime = expiryTime;
	}

	public int getNewsCategoryId() {
		return this.newsCategoryId;
	}

	public void setNewsCategoryId(int newsCategoryId) {
		this.newsCategoryId = newsCategoryId;
	}

	public String getNewsImage() {
		return this.newsImage;
	}

	public void setNewsImage(String newsImage) {
		this.newsImage = newsImage;
	}

	public String getNewsText() {
		return this.newsText;
	}

	public void setNewsText(String newsText) {
		this.newsText = newsText;
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}