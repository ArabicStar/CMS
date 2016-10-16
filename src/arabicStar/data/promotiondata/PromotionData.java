package arabicStar.data.promotiondata;

import arabicStar.po.PromotionPO;
import arabicStar.util.promotion.Promotion;

/**
 * 这是Promotion的数据接口
 * @author Vivian
 *
 */
public interface PromotionData {

	public Promotion getDiscription();

	public void insert(PromotionPO po);

	public void delete(PromotionPO po);

	public void update(PromotionPO po);

	public PromotionPO find(int id);
}
