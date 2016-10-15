package arabicStar.promotion.promotionbl;

import arabicStar.order.Order;

/**
 * 这是Promotion的逻辑接口
 * @author Vivian
 *
 */
public interface IPromotionBl {

	/**
	 * 将传入的订单经过促销策略装饰再次返回
	 * @return 返回打过折的订单
	 * TODO: 传入初始订单
	 */
	public Order apply(Order order);
}
