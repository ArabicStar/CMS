package arabicStar.dataservice.memberdataservice;

import arabicStar.data.memberdata.MemberData;
import arabicStar.util.member.Member;
import arabicStar.vo.ResultMessage;

public class MemberDataService implements MemberData {

	@Override
	public ResultMessage newMember(Member newMember) {
		System.out.println("Add a new member");
		return new ResultMessage();
	}

	@Override
	public Member getMember(int id) {
		System.out.println("Looking up member...");
		return new Member();
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
