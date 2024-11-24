package com.zipintelligence.model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the coupon_usage database table.
 * 
 */
@Entity
@Table(name="coupon_usage")
@NamedQuery(name="CouponUsage.findAll", query="SELECT c FROM CouponUsage c")
public class CouponUsage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="used_time")
	private Timestamp usedTime;

	//bi-directional many-to-one association to Coupon
	@ManyToOne
	private Coupon coupon;

	//bi-directional many-to-one association to User
	@ManyToOne
	private User user;

	public CouponUsage() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getUsedTime() {
		return this.usedTime;
	}

	public void setUsedTime(Timestamp usedTime) {
		this.usedTime = usedTime;
	}

	public Coupon getCoupon() {
		return this.coupon;
	}

	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}