package arabicStar.blServiceImpl.marketBLServiceImpl;

import arabicStar.blService.hotelBLService.HotelLogicService;
import arabicStar.blService.marketBLService.MarketLogicService;
import arabicStar.blService.memberBLService.MemberLogicService;
import arabicStar.vo.CreditChangeVO;
import arabicStar.vo.OrderVO;
import arabicStar.vo.PromotionVO;

public class MarketLogicServiceImpl_Stub implements MarketLogicService {
	private MemberLogicService memberBL;
	private HotelLogicService hotelBL;

	public MarketLogicServiceImpl_Stub(MemberLogicService memberBL, HotelLogicService hotelBL) {
		this.memberBL = memberBL;
		this.hotelBL = hotelBL;
	}

	@Override
	public boolean makeNewPromotion(PromotionVO newPromotion) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public PromotionVO[] getCurrentPromotion() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean deletePromotion(String id) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean updatePromotion(PromotionVO changedPromotion) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public PromotionVO getPromotion(String id) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public OrderVO[] getAbnormalOrders() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public OrderVO findAbnornalOrder(String orderID) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean rescueOrder(String orderID) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public CreditChangeVO chargeCredit(int money) {
		// TODO 自动生成的方法存根
		return null;
	}

}
