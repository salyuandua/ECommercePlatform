package com.ecommerce.bean;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="accounts")
public class Account implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6199518771707167254L;

	@Id
	@Column(name="account_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="account_firstname")
	private String firstName;
	
	
	@Column(name="account_midname")
	private String midName;
	
	@Column(name="account_lastname")
	private String lastName;
	
	@Column(name="account_email")
	private String email;
	
	@Column(name="account_password")
	private String password;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="account_type")
	private AccountType type;
	
	
	@OneToMany(fetch=FetchType.EAGER,targetEntity=Address.class,cascade=CascadeType.ALL)
	@JoinColumn(name="address_account_id")
	private Set<Address> addresses;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="account_company")
	private Company company;

	@OneToMany(fetch=FetchType.EAGER,targetEntity=PaymentMethod.class,cascade=CascadeType.ALL)
	@JoinColumn(name="payment_method_account")
	private Set<PaymentMethod> payMethods;
	
	
}
