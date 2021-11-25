package model;

public class Product {

	char sku;
	int unitPrice;

	public Product(char sku, int unitPrice) {
		super();
		this.sku = sku;
		this.unitPrice = unitPrice;
	}

	public char getSku() {
		return sku;
	}

	public void setSku(char sku) {
		this.sku = sku;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	

}
