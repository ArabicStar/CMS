package arabicStar.blServiceImpl.memberBLServiceImpl;

import arabicStar.blService.memberBLService.MemberLogicService;
import arabicStar.blService.orderBLService.OrderLogicService;
import arabicStar.blService.promotionBLService.PromotionLogicService;
import arabicStar.vo.ContactVO;
import arabicStar.vo.MemberVO;
import arabicStar.vo.ResultMessage;

public class MemberLogicServiceImpl_Stub implements MemberLogicService {
	private OrderLogicService orderBL;
	private PromotionLogicService promotionBL;

	public MemberLogicServiceImpl_Stub(OrderLogicService orderBL, PromotionLogicService promotionBL) {
		this.orderBL = orderBL;
		this.promotionBL = promotionBL;
	}

	@Override
	public ResultMessage updateInfo(MemberVO info) {
		System.out.println("Update Info success!");
		return new ResultMessage();
	}

	@Override
	public String getName() {
		return "Jack";
	}

	@Override
	public ContactVO getContact() {
		System.out.println("Acquiring contact info");
		return new ContactVO();
	}

	@Override
	public ResultMessage updateCredit(int increment) {
		System.out.println("Credit gain!");
		return new ResultMessage();
	}

	@Override
	public int getCredit() {
		return 100;
	}

}
