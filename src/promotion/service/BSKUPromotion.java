package promotion.service;

import java.util.Map;

import model.Product;

public interface BSKUPromotion {

	static int getPromotionForBSKU(Map.Entry<Product, Integer> productDesc) throws Exception {
		Integer skuQty = productDesc.getValue();
		int unitPrice = productDesc.getKey().getUnitPrice();
		if (skuQty != 0)
			return (skuQty / 2) * 45 + (skuQty % 2) * unitPrice;
		else
			throw new NullPointerException();
	}

}
