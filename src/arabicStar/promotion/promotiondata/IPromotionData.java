package arabicStar.promotion.promotiondata;

import arabicStar.promotion.Promotion;

/**
 * 这是Promotion的数据接口
 * @author Vivian
 *
 */
public interface IPromotionData {

	/**
	 * 获取促销策略信息
	 * @return 返回促销策略名称与介绍
	 */
	public Promotion getDiscription();
}
