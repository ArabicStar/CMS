package arabicStar.bl.memberbl;

import arabicStar.vo.ContactInfo;
import arabicStar.vo.MemberInfo;
import arabicStar.vo.ResultMessage;

/**
 * @author tinke
 * 
 *         Business logic interface of member module
 */
public interface MemberBL {

	/**
	 * @param info
	 *            pack of member's info to be modified
	 * @return result of operation
	 */
	public ResultMessage updateInfo(MemberInfo info);

	/**
	 * @return member's name
	 */
	public String getName();

	/**
	 * @return member's contact info
	 */
	public ContactInfo getContact();

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
