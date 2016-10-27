package arabicStar.blServiceImpl.memberBLServiceImpl;

import arabicStar.blService.memberBLService.MemberLogicService;
import arabicStar.blService.orderBLService.OrderLogicService;
import arabicStar.blService.promotionBLService.PromotionLogicService;
import arabicStar.vo.ContactVO;
import arabicStar.vo.CreditChangeVO;
import arabicStar.vo.MemberVO;
import arabicStar.vo.OrderVO;
import arabicStar.vo.ResultMessage;

public class MemberLogicServiceImpl_Stub implements MemberLogicService {
	private OrderLogicService orderBL;
	private PromotionLogicService promotionBL;

	public MemberLogicServiceImpl_Stub(OrderLogicService orderBL, PromotionLogicService promotionBL) {
		this.orderBL = orderBL;
		this.promotionBL = promotionBL;
	}

	@Override
	public MemberVO getMemberInfo(String id) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public CreditChangeVO[] getCreditChanges(String id) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public OrderVO[] getOrderHistory(String id) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean updateInfo(MemberVO info) {
		// TODO 自动生成的方法存根
		return false;
	}

}
