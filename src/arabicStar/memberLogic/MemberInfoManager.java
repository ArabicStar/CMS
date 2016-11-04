package arabicStar.memberLogic;

import arabicStar.memberDataService.MemberDataService;
import arabicStar.vo.CreditChangeVO;
import arabicStar.vo.MemberVO;
import arabicStar.vo.OrderVO;

public class MemberInfoManager implements MemberInfoService {
	private MemberDataService data;
	private AccoutManager accoutManager;

	@Override
	public boolean updateInfo(MemberVO info) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public MemberVO getMemberInfo(String id) {
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

}
