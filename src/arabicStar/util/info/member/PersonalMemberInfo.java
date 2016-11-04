package arabicStar.util.info.member;

import java.time.LocalDate;

public abstract class PersonalMemberInfo extends MemberInfo {

	public PersonalMemberInfo() {
		super(Type.PERSONAL);
	}

	public abstract ContactInfo getContact();

	@Override
	public LocalDate getBirthday() {
		return birthday;
	}

	@Override
	public String getEnterprise() {
		return null;
	}

}
