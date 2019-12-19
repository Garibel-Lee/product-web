package com._520it.shopping.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com._520it.shopping.dao.IProductDAO;
import com._520it.shopping.dao.impl.ProductDAOImpl;
import com._520it.shopping.domain.Product;

public class ProductDAOTest {

	private IProductDAO  dao=new ProductDAOImpl();
	@Test
	public void testSave() {
		 
	}

	@Test
	public void testUpdate() {
		 
	}

	@Test
	public void testDelete() {
	}

	@Test
	public void testGet() {
		 
	}

	@Test
	public void testList() {
		List<Product> list=dao.list();
		for (Product p : list) {
			System.out.println(p);
		}

	}

}
