package arabicStar.promotion.promotiondataservice;

import arabicStar.promotion.Promotion;
import arabicStar.promotion.promotiondata.IPromotionData;

/**
 * 这是Promotion的数据接口方法实现
 * @author Vivian
 *
 */
public class PromotionDataService implements IPromotionData {

	@Override
	public Promotion getDiscription() {
		// TODO Auto-generated method stub
		System.out.println("获取描述成功");
		return null;
	}

}
