package com.ecommerce.account;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.bean.Account;
import com.ecommerce.bean.Company;

@Repository
public class DefaultAccountDao implements AccountDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean signup(Account account) {
		
		
		
		return false;
	}

	
	
	@Override
	public List<Company> companyList() {
		Session session=sessionFactory.getCurrentSession();
		List<Company> companies=session.createQuery("from Company",Company.class).list();
		return companies;
	}
}
