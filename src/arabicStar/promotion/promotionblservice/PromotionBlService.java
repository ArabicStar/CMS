package arabicStar.promotion.promotionblservice;

import arabicStar.order.Order;
import arabicStar.promotion.promotionbl.IPromotionBl;

/**
 * 这是Promotion的逻辑接口方法实现
 * @author Vivian
 *
 */
public class PromotionBlService implements IPromotionBl {

	@Override
	public Order apply(Order order) {
		// TODO Auto-generated method stub
		System.out.println("策略应用成功");
		return null;
	}

}
