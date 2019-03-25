package com.ecommerce.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.bean.Company;

@Service
@Transactional(rollbackFor=Exception.class)
public class DefaultAccountService implements AccountService{
	@Autowired
	private AccountDao accountDao;

	@Override
	public List<Company> companyList() {
		// TODO Auto-generated method stub
		return accountDao.companyList();
	}
	
	
	
}
