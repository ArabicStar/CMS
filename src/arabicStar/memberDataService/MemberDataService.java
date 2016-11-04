package arabicStar.memberDataService;

import arabicStar.po.CreditChangePO;
import arabicStar.po.MemberPO;

public interface MemberDataService {
	public boolean insertMember(MemberPO newMember);

	public MemberPO deleteMember(String memberID);

	public MemberPO findMember(String memberID);

	public boolean updateMember(MemberPO member);

	public MemberPO updateCredit(String memberID, int valChange);

	public CreditChangePO[] getCreditChanges(String memberID);

}
