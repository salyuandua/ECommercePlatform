package com.ecommerce.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/list")
	public String list(Model model) {
		//System.out.println("hahahaha");
		model.addAttribute("products", productService.productList());
		return "/product/productList";
	}
	
	@RequestMapping("/detail/{id}")
	public String productDetail(@PathVariable int id) {
		System.out.println(id);
		return "";
	}
	
	
}
