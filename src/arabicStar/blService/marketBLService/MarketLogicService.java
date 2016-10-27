package arabicStar.blService.marketBLService;

import arabicStar.vo.CreditChangeVO;
import arabicStar.vo.OrderVO;
import arabicStar.vo.PromotionVO;

/**
 * market的逻辑接口
 * 
 * @author ParanoiaSun
 *
 */
public interface MarketLogicService {

	public boolean makeNewPromotion(PromotionVO newPromotion);

	public PromotionVO[] getCurrentPromotion();

	public boolean deletePromotion(String id);

	public boolean updatePromotion(PromotionVO changedPromotion);

	public PromotionVO getPromotion(String id);

	public OrderVO[] getAbnormalOrders();

	public OrderVO findAbnornalOrder(String orderID);

	public boolean rescueOrder(String orderID);

	public CreditChangeVO chargeCredit(int money);

}
