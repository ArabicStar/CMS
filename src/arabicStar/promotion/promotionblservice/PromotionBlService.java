package arabicStar.promotion.promotionblservice;

import arabicStar.order.Order;
import arabicStar.promotion.promotionbl.IPromotionBl;

/**
 * 这是Promotion的逻辑接口方法实现
 * @author Vivian
 *
 */
public class PromotionBlService implements IPromotionBl {

	/**
	 * 将传入的订单经过促销策略装饰再次返回
	 * @return 返回打过折的订单
	 * TODO: 传入初始订单
	 */
	@Override
	public Order apply(Order order) {
		// TODO Auto-generated method stub
		System.out.println("策略应用成功");
		return null;
	}

}
