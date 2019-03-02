package com.capgemini.takehome.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.takehome.dao.IProductDAO;
import com.capgemini.takehome.dao.ProductDAO;
import com.capgemini.takehome.exception.ProductCodeIsNotValidException;
import com.capgemini.takehome.exception.ProductException;
import com.capgemini.takehome.service.IProductService;
import com.capgemini.takehome.service.ProductService;

public class ProductTesting {

	/*
	 * updateProduct 1. when non-existing product category is passed system should
	 * throw Product Exception 2. when existing product category is passed system
	 * should update details of that category
	 */

	IProductDAO iProductDAO = new ProductDAO();

	IProductService iProductService = new ProductService();

	@Before
	public void setUp() throws Exception {
	}

	@Test(expected = ProductException.class)
	public void whenInvalidCategoryIsPassedSystemShouldThrowException() throws ProductException {

		try {
			iProductService.getProductDetails(10);
		} catch (ProductCodeIsNotValidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void whenValidProductCategoryIsPassedSystemShouldUpdateTheDetailsOfThatCategory() throws ProductException {

		try {
			assertEquals(2, iProductService.getProductDetails(10));
		} catch (ProductCodeIsNotValidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
