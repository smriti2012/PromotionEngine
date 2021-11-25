package model;

import java.util.List;

public class Cart {

	List<Product> products;

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Cart(List<Product> products) {
		super();
		this.products = products;
	}
}
