package arabicStar.dataServiceImpl.memberDataServiceImpl;

import arabicStar.data.memberDataService.MemberDataService;
import arabicStar.po.MemberPO;
import arabicStar.util.member.Member;
import arabicStar.vo.ResultMessage;

public class MemberDataServiceImpl_Stub implements MemberDataService {

	@Override
	public ResultMessage newMember(MemberPO newMember) {
		System.out.println("Add a new member");
		return new ResultMessage();
	}

	@Override
	public MemberPO getMember(int id) {
		System.out.println("Looking up member...");
		return new MemberPO();
	}

	@Override
	public ResultMessage updateCredit(Member member, int increment) {
		System.out.println("Credit is being modifying");
		return new ResultMessage();
	}

	@Override
	public ResultMessage getCreditRecord(Member member) {
		System.out.println("Looking up credit recortd...");
		return new ResultMessage();
	}

}
