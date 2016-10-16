package arabicStar.blservice.memberblservice;

import arabicStar.bl.memberbl.MemberBL;
import arabicStar.vo.ContactInfo;
import arabicStar.vo.MemberInfo;
import arabicStar.vo.ResultMessage;

public class MemberBLService implements MemberBL {

	@Override
	public ResultMessage updateInfo(MemberInfo info) {
		System.out.println("Update Info success!");
		return new ResultMessage();
	}

	@Override
	public String getName() {
		return "Jack";
	}

	@Override
	public ContactInfo getContact() {
		System.out.println("Acquiring contact info");
		return new ContactInfo();
	}

	@Override
	public ResultMessage updateCredit(int increment) {
		System.out.println("Credit gain!");
		return new ResultMessage();
	}

	@Override
	public int getCredit() {
		return 100;
	}

}
