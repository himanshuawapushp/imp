package com.capgemini.takehome.service;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.exception.ProductCodeIsNotValidException;
import com.capgemini.takehome.exception.ProductException;

public interface IProductService {
	Product getProductDetails(int productCode) throws ProductException, ProductCodeIsNotValidException;
}
