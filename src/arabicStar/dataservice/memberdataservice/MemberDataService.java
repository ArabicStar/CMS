package arabicStar.dataservice.memberdataservice;

import arabicStar.data.memberdata.MemberData;
import arabicStar.po.MemberPO;
import arabicStar.vo.ResultMessage;

public class MemberDataService implements MemberData {

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
	public ResultMessage updateCredit(MemberPO member, int increment) {
		System.out.println("Credit is being modifying");
		return new ResultMessage();
	}

	@Override
	public ResultMessage getCreditRecord(MemberPO member) {
		System.out.println("Looking up credit recortd...");
		return new ResultMessage();
	}

	public void insert(MemberPO po){
		System.out.println("Insert Succeed!");
	}

	public void delete(MemberPO po){
		System.out.println("Delete Succeed!");
	}

	public void update(MemberPO po){
		System.out.println("Update Succeed!");
	}

	public MemberPO find(int id){
		System.out.println("Find Succeed!");
		MemberPO po = new MemberPO();
		return po;
	}

}
