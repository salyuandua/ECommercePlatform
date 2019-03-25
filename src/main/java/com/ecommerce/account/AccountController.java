package com.ecommerce.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {
@Autowired
private AccountService accountService;

@RequestMapping("/getSignup")
public String getSignupPage(Model model) {
	model.addAttribute("companies", accountService.companyList());
	return "/account/signup";
}


}
