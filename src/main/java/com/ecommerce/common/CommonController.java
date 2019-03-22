package com.ecommerce.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerce.product.ProductService;

@Controller
public class CommonController {

	@Autowired
	private ProductService productService;
	
	/**
	 * Home page
	 * @param model
	 * @return
	 */
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("departments", productService.departmentList());
		return "home";
	}
}
