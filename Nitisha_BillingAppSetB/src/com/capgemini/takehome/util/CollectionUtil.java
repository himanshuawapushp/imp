package com.capgemini.takehome.util;

import java.util.*;

import com.capgemini.takehome.bean.Product;

public class CollectionUtil {
	private static Map<Integer, Product> products = new HashMap<Integer, Product>();
	static {
		products.put(1001, new Product(1001, "iPhone", "Electronics", 35000));
		products.put(1002, new Product(1002,"Electronics", "LEDTV", 45000));
		products.put(1003, new Product(1003, "Teddy", "Toys", 800));
		products.put(1004, new Product(1004, "Telescope", "Toys", 5000));
	}

	public HashMap<Integer, Product> getList() {
		return (HashMap<Integer, Product>) products;

	}
}