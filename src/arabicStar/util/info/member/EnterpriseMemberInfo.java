package arabicStar.util.info.member;

import java.time.LocalDate;

public abstract class EnterpriseMemberInfo extends MemberInfo {

	protected EnterpriseMemberInfo() {
		super(Type.BUSINESS);
	}

	public abstract ContactInfo getContact();

	@Override
	public LocalDate getBirthday() {
		return null;
	}

	@Override
	public String getEnterprise() {
		return enterprise;
	}

}
