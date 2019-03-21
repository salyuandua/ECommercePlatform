package com.ecommerce.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultAccountService {
	@Autowired
	private AccountDao accountDao;
	
	
	
}
