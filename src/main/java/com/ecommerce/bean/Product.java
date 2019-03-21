package com.ecommerce.bean;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8915127292133638004L;

	@Id
	@Column(name="product_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="product_name")
	private String name;
	
	@Column(name="project_inventory")
	private int inventory;
	
	@Column(name="product_price")
	private double price;
	
	@Column(name="product_description")
	private String description;
	
	@OneToMany(cascade=CascadeType.ALL,targetEntity=Company.class)
	@JoinColumn(name="product_company")
	private Company company;
	
	
	
	
}
