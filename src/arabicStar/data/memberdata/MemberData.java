package arabicStar.data.memberdata;

import arabicStar.po.MemberPO;
import arabicStar.vo.ResultMessage;

public interface MemberData {
	public ResultMessage newMember(MemberPO newMember);

	public MemberPO getMember(int id);

	public ResultMessage updateCredit(MemberPO member, int increment);

	public ResultMessage getCreditRecord(MemberPO member);

	public void insert(MemberPO po);

	public void delete(MemberPO po);

	public void update(MemberPO po);

	public MemberPO find(int id);
}
