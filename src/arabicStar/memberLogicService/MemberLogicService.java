package arabicStar.memberLogicService;

import arabicStar.vo.CreditChangeVO;
import arabicStar.vo.MemberVO;
import arabicStar.vo.MemberVOBuilder;
import arabicStar.vo.OrderVO;

/**
 * @author tinke
 * 
 *         Business logic interface of member module
 */
public interface MemberLogicService {
	public boolean login(String id, String passwordHash);

	public boolean register(MemberVOBuilder member);

	public boolean updateInfo(MemberVO info);

	public MemberVO getMemberInfo(String id);

	public CreditChangeVO[] getCreditChanges(String id);

	public OrderVO[] getOrderHistory(String id);

}
