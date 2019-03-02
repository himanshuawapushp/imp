package com.capgemini.takehome.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.dao.IProductDAO;
import com.capgemini.takehome.dao.ProductDAO;
import com.capgemini.takehome.exception.ProductCodeIsNotValidException;
import com.capgemini.takehome.exception.ProductException;

public class ProductService implements IProductService {

	IProductDAO product = new ProductDAO();

	@Override
	public Product getProductDetails(int productCode) throws ProductException {
		// TODO Auto-generated method stub
		if (codeValidation(productCode))
			return product.getProductDetails(productCode);

	
throw new ProductException(null);
	}
	public boolean codeValidation(int productCode) {
		Pattern pat = Pattern.compile("[0-9]{4}");
		String string = String.valueOf(productCode);

		Matcher mat = pat.matcher(string);
		return mat.matches();
	}

	public boolean quantityValidation(int quantity) {
		if (quantity <= 0)
			return false;
		else
			return true;
	}

}
