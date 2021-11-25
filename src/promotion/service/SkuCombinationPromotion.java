package promotion.service;

public interface SkuCombinationPromotion {

	public static int getPromotionforCAndD(int Cqty, int Dqty) throws Exception {
		if (Cqty != 0 && Dqty != 0) {
			if (Cqty < Dqty)
				return Cqty * 30 + (Dqty - Cqty) * 15;
			else
				return Dqty * 30 + (Cqty - Dqty) * 15;
		} else
			throw new NullPointerException();

	}
}
