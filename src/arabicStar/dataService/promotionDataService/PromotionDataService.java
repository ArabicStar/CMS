package arabicStar.dataService.promotionDataService;

import arabicStar.po.PromotionPO;

/**
 * 这是Promotion的数据接口
 * @author Vivian
 *
 */
public interface PromotionDataService {

	public PromotionPO getDiscription();
	
	public boolean insertPromotion(PromotionPO promotionPO);
	
	public PromotionPO deletePromotion(PromotionPO promotionPO);
	
	public PromotionPO findPromotion(PromotionPO promotionPO);
	
	public boolean updatePromotion(PromotionPO promotionPO);
}
