package com.capgemini.takehome.dao;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.exception.ProductException;

public interface IProductDAO {
	Product getProductDetails(int productCode) throws ProductException;

	Product getProductDetails() throws ProductException;
}
