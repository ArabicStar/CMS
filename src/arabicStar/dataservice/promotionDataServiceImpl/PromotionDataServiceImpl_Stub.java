package arabicStar.dataservice.promotionDataServiceImpl;

import arabicStar.data.promotionDataService.PromotionDataService;
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
	public Promotion getDiscription() {
		// TODO Auto-generated method stub
		System.out.println("获取描述成功");
		return null;
	}

	@Override
	public boolean insert(PromotionPO po) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PromotionPO find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(PromotionPO po) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(PromotionPO po) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
