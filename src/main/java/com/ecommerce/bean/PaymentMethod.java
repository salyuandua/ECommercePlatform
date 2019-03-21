package com.ecommerce.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment_method")
public class PaymentMethod implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6125293485071290152L;

	@Id
	@Column(name="payment_method_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="payment_method_card_num")
	private String cardNum;
	
	@Column(name="payment_method_card_holder")
	private String cardHolder;
	
	@Column(name="payment_method_expire_date")
	private Date expireDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getCardHolder() {
		return cardHolder;
	}

	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	@Override
	public String toString() {
		return "PaymentMethod [id=" + id + ", cardNum=" + cardNum + ", cardHolder=" + cardHolder + ", expireDate="
				+ expireDate + "]";
	}
	
	
}
