package com.capgemini.takehome.bean;

public class Product {
	private String productName;
	private String productCategory;
	private int productPrice;
	private int productID;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int productID, String productName, String productCategory, int productPrice) {
		super();
		this.productName = productName;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productCategory == null) ? 0 : productCategory.hashCode());
		result = prime * result + productID;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + productPrice;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (productCategory == null) {
			if (other.productCategory != null)
				return false;
		} else if (!productCategory.equals(other.productCategory))
			return false;
		if (productID != other.productID)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (productPrice != other.productPrice)
			return false;
		return true;
	}

}