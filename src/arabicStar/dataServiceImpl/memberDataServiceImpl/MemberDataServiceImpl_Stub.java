package arabicStar.dataServiceImpl.memberDataServiceImpl;

import arabicStar.dataService.memberDataService.MemberDataService;
import arabicStar.po.CreditChangePO;
import arabicStar.po.MemberPO;
import arabicStar.util.member.Member;
import arabicStar.vo.ResultMessage;

public class MemberDataServiceImpl_Stub implements MemberDataService {

	public ResultMessage newMember(MemberPO newMember) {
		System.out.println("Add a new member");
		return new ResultMessage();
	}

	public MemberPO getMember(int id) {
		System.out.println("Looking up member...");
		return null;
	}

	public ResultMessage updateCredit(Member member, int increment) {
		System.out.println("Credit is being modifying");
		return new ResultMessage();
	}

	public ResultMessage getCreditRecord(Member member) {
		System.out.println("Looking up credit recortd...");
		return new ResultMessage();
	}

	public boolean insertMember(MemberPO newMember) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public MemberPO deleteMember(String memberID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberPO findMember(String memberID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateMember(MemberPO member) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public MemberPO updateCredit(String memberID, int valChange) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CreditChangePO[] getCreditChanges(String memberID) {
		// TODO Auto-generated method stub
		return null;
	}

}
