package com._520it.shopping.dao;

import java.util.List;

import com._520it.shopping.domain.Product;

public interface IProductDAO {
	void save(Product obj);
	void update(Product obj);
	void delete(Long id);
	Product get(Long id);
	List<Product> list();
	
	//约定优于配置
}
