package arabicStar.promotion.promotionbl;

import arabicStar.order.Order;

/**
 * 这是Promotion的逻辑接口
 * @author Vivian
 *
 */
public interface IPromotionBl {

	public Order apply(Order order);
}
