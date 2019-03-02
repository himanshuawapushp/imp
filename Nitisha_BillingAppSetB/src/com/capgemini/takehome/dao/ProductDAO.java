package com.capgemini.takehome.dao;

import java.util.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.exception.ProductException;
import com.capgemini.takehome.util.CollectionUtil;

public class ProductDAO implements IProductDAO {

	Map<Integer, Product> products = new HashMap<Integer, Product>();
	CollectionUtil collection = new CollectionUtil();

	@Override
	public Product getProductDetails(int productCode) throws ProductException {
		// TODO Auto-generated method stub

		products = collection.getList();
		for (Map.Entry<Integer, Product> product : products.entrySet()) {
			if (product.getKey() == productCode) {

				return products.get(product.getKey());

			}
		}

		throw new ProductException("Product code is not exist in the hashmap");

	}

	@Override
	public Product getProductDetails() throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

}
