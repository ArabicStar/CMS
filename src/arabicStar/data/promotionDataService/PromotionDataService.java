package arabicStar.data.promotionDataService;

import arabicStar.po.PromotionPO;
import arabicStar.util.promotion.Promotion;

/**
 * 这是Promotion的数据接口
 * 
 * @author Vivian
 *
 */
public interface PromotionDataService {

	public Promotion getDiscription();

	public boolean insert(PromotionPO po);

	public PromotionPO find(int id);

	public boolean delete(PromotionPO po);

	public boolean update(PromotionPO po);
	
}
