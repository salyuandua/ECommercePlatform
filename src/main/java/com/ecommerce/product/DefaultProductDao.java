package com.ecommerce.product;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.bean.Department;
import com.ecommerce.bean.Product;

@Repository
@Transactional(rollbackFor=Exception.class)
@SuppressWarnings("unchecked")
public class DefaultProductDao implements ProductDao{

	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	public List<Product> productList() {
		Session session=sessionFactory.getCurrentSession();
		
		List<Product> products=session.createQuery("from Product").list();
		//session.close();
		return products;
	}

	/**
	 * Get all product departments
	 */
	@Override
	public List<Department> departmentList() {
		Session session=sessionFactory.getCurrentSession();
		return session.createQuery("from Department").list();
	}

	@Override
	public List<Product> productListByDepId(int depId) {
		Department d=new Department();
		d.setId(depId);
		Session session=sessionFactory.getCurrentSession();
		List<Product> products= session.createQuery("from Product where department=?0", Product.class).setParameter(0, d).list();
		
		return products;
	}

	@Override
	public Product productById(int id) {
		Session session=sessionFactory.getCurrentSession();
		
		
		return session.get(Product.class, id);
	}
	
	
	

}
