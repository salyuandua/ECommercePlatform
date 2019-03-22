package com.ecommerce.product;

import java.util.List;

import com.ecommerce.bean.Department;
import com.ecommerce.bean.Product;

public interface ProductService {

	public List<Product> productList();
	public List<Department> departmentList();
	
	public List<Product> productListByDepId(int depId);
	
	public Product productById(int id);
}
