package arabicStar.blService.memberBLService;

import arabicStar.vo.ContactVO;
import arabicStar.vo.MemberVO;
import arabicStar.vo.ResultMessage;

/**
 * @author tinke
 * 
 *         Business logic interface of member module
 */
public interface MemberLogicService {

	/**
	 * @param info
	 *            pack of member's info to be modified
	 * @return result of operation
	 */
	public ResultMessage updateInfo(MemberVO info);

	/**
	 * @return member's name
	 */
	public String getName();

	/**
	 * @return member's contact info
	 */
	public ContactVO getContact();

	/**
	 * @param increment
	 *            increment of credit
	 * @return result of operation
	 */
	public ResultMessage updateCredit(int increment);

	/**
	 * @return member's credit
	 */
	public int getCredit();
}
