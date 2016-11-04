package arabicStar.po;

import java.time.LocalDate;

import arabicStar.util.info.member.ContactInfo;
import arabicStar.util.info.member.MemberInfo;

public class MemberPOBuilder {
	private String id;
	private String passwordHash;
	private String name;
	private ContactPO contact;
	private LocalDate birthday;
	private String ID_PATTERN = "[1-9][0-9]{7}";

	public MemberPOBuilder() {
	}

	public MemberPOBuilder(MemberInfo info) {
		setId(info.getID());
		setName(info.getName());
		setContact(new ContactPOBuilder(info.getContact()).getContactPO());
		setBirthday(info.getBirthday());
	}

	public MemberPOBuilder(MemberPO po) {
		this((MemberInfo) po);
		setPasswordHash(po.getPasswordHash());
	}

	public MemberPOBuilder setContact(ContactInfo contact) {
		this.contact = new ContactPOBuilder(contact).getContactPO();
		return this;
	}

	public MemberPOBuilder setId(String id) {
		if (id.matches(ID_PATTERN))
			this.id = id;
		return this;
	}

	public MemberPOBuilder setPasswordHash(String passwordHash) {
		if (passwordHash == null)
			return this;

		if (passwordHash.length() != 0)
			this.passwordHash = passwordHash;
		return this;
	}

	public MemberPOBuilder setName(String name) {
		if (name == null)
			return this;

		String raw = name.replaceAll("\\s", "");
		if (raw.length() != 0)
			this.name = name.replaceAll("(.{1})", "$1 ");
		// to avoid injection attack
		return this;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;// LocalDate is immutable itself
	}

	public boolean isReady() {
		return (id != null && passwordHash != null && name != null && contact != null && birthday != null);
	}

	public MemberPO getMemberPO() {
		if (!isReady())
			return null;

		return new MemberPO().setContact(contact).setId(id).setName(name).setPasswordHash(passwordHash)
				.setBirthday(birthday);
	}
}
