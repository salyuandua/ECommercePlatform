package com.ecommerce.account;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DefaultAccountDao implements AccountDao{
	
	@Autowired
	private SessionFactory sessionFactory;
}
