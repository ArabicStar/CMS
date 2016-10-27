package arabicStar.dataServiceImpl.promotionDataServiceImpl;

import arabicStar.dataService.promotionDataService.PromotionDataService;
import arabicStar.po.PromotionPO;
import arabicStar.util.promotion.Promotion;

/**
 * 这是Promotion的数据接口方法实现
 * @author Vivian
 *
 */
public class PromotionDataServiceImpl_Stub implements PromotionDataService {

	/**
	 * 获取促销策略信息
	 * @return 返回促销策略名称与介绍
	 */
	@Override
	public PromotionPO getDiscription() {
		// TODO Auto-generated method stub
		System.out.println("获取描述成功");
		return null;
	}



	@Override
	public boolean insertPromotion(PromotionPO promotionPO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PromotionPO deletePromotion(PromotionPO promotionPO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PromotionPO findPromotion(PromotionPO promotionPO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updatePromotion(PromotionPO promotionPO) {
		// TODO Auto-generated method stub
		return false;
	}

}
