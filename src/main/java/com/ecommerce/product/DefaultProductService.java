package com.ecommerce.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.bean.Department;
import com.ecommerce.bean.Product;
@Service
public class DefaultProductService implements ProductService{

	@Autowired
	private ProductDao dao;
	
	@Override
	public List<Product> productList() {
		return dao.productList();
	}

	@Override
	public List<Department> departmentList() {
		// TODO Auto-generated method stub
		return dao.departmentList();
	}

	@Override
	public List<Product> productListByDepId(int depId) {
		// TODO Auto-generated method stub
		return dao.productListByDepId(depId);
	}

	@Override
	public Product productById(int id) {
		// TODO Auto-generated method stub
		return dao.productById(id);
	}

}
