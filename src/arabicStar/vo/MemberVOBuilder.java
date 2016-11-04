package arabicStar.vo;

import java.time.LocalDate;

import arabicStar.util.info.member.MemberInfo;

public class MemberVOBuilder {
	private String id;
	private String name;
	private ContactVO contact;
	private LocalDate birthday;

	private static final String ID_PATTERN = "[0-9]{8}";

	private static final MemberVO INVALID_MEMBER_VO;
	static {
		INVALID_MEMBER_VO = new MemberVO();
		INVALID_MEMBER_VO.invalidate();
	}

	public static MemberInfo getInvalidInfo() {
		return INVALID_MEMBER_VO;
	}

	public MemberVOBuilder() {
	}

	public MemberVOBuilder(MemberInfo info) {
		if (!info.isValid())
			return;
		setId(info.getID());
		String name = info.getName().replace("\\s*", "");
		setName(name);
		setContact(new ContactVOBuilder(info.getContact()).getContactVO());
		setBirthday(info.getBirthday());
	}

	public MemberVOBuilder setContact(ContactVO contact) {
		this.contact = new ContactVOBuilder(contact).getContactVO();
		return this;
	}

	public MemberVOBuilder setId(String id) {
		if (id.matches(ID_PATTERN))
			this.id = id;
		return this;
	}

	public MemberVOBuilder setName(String name) {
		if (name.length() != 0)
			if (!name.contains("\\s"))
				this.name = name;
		return this;
	}

	public MemberVOBuilder setBirthday(LocalDate birthday) {
		this.birthday = birthday;// LocalDate is immutable itself
		return this;
	}

	public boolean isReady() {
		return (id != null && name != null && contact != null && birthday != null);
	}

	public MemberVO getMemberVO() {
		if (!isReady())
			return null;

		return new MemberVO().setContact(contact).setID(id).setName(name).setBirthday(birthday);
	}
}
