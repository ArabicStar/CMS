package arabicStar.dataService.memberDataService;

import arabicStar.po.MemberPO;
import arabicStar.util.member.Member;
import arabicStar.vo.ResultMessage;

public interface MemberDataService {
	public ResultMessage newMember(MemberPO newMember);

	public MemberPO getMember(int id);

	public ResultMessage updateCredit(Member member, int increment);

	public ResultMessage getCreditRecord(Member member);
}
