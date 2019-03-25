package com.ecommerce.account;

import java.util.List;

import com.ecommerce.bean.Account;
import com.ecommerce.bean.Company;

public interface AccountDao {

	public List<Company> companyList();
	
	public boolean signup(Account account);

	
	
}
