package promotion.service;

import java.util.Map;

import model.Product;

public interface ASKUPromotion {

	static int getPromotionForASKU(Map.Entry<Product, Integer> productDesc) throws Exception {
		Integer skuQty = productDesc.getValue();
		int unitPrice = productDesc.getKey().getUnitPrice();
		if (skuQty != 0)
			return (skuQty/ 3) * 130 + (skuQty % 3) * unitPrice;
		else
			throw new NullPointerException();
	}

}
