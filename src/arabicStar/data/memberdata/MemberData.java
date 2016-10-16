package arabicStar.data.memberdata;

import arabicStar.util.member.Member;
import arabicStar.vo.ResultMessage;

public interface MemberData {
	public ResultMessage newMember(Member newMember);

	public Member getMember(int id);

	public ResultMessage updateCredit(Member member, int increment);

	public ResultMessage getCreditRecord(Member member);
}
