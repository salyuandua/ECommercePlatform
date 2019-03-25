package com.ecommerce.bean;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="accounts")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType=DiscriminatorType.INTEGER,name="account_type")
public class Account implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6199518771707167254L;

	@Id
	@Column(name="account_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty
	@Column(name="account_firstname")
	private String firstName;
	
	
	@Column(name="account_midname")
	private String midName;
	
	@NotEmpty
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMidName() {
		return midName;
	}

	public void setMidName(String midName) {
		this.midName = midName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Set<PaymentMethod> getPayMethods() {
		return payMethods;
	}

	public void setPayMethods(Set<PaymentMethod> payMethods) {
		this.payMethods = payMethods;
	}
	
	
}
