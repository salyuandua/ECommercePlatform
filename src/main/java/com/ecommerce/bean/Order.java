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
@Table(name="order")
public class Order implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2106342998383180436L;
	@Id
	@Column(name="order_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="order_num")
	private String number;
	
	@Column(name="order_price")
	private double price;
	
	private Date startDate;
	
	
	
}
