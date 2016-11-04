package arabicStar.memberLogic;

import arabicStar.vo.CreditChangeVO;
import arabicStar.vo.MemberVO;
import arabicStar.vo.OrderVO;

public interface MemberInfoService {
	public boolean updateInfo(MemberVO info);

	public MemberVO getMemberInfo(String id);

	public CreditChangeVO[] getCreditChanges(String id);

	public OrderVO[] getOrderHistory(String id);

}
