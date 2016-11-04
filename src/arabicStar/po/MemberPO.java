package arabicStar.po;

import java.time.LocalDate;

import arabicStar.util.info.member.ContactInfo;
import arabicStar.util.info.member.MemberInfo;

public class MemberPO extends MemberInfo {
	private String passwordHash;

	MemberPO() {
	}


	@Override
	public String getID() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public ContactInfo getContact() {
		return new ContactPOBuilder(contact).getContactPO();
	}

	@Override
	public LocalDate getBirthday() {
		return birthday;
	}

	public String getPasswordHash() {
		return passwordHash;
	}


	MemberPO setId(String id) {
		this.id = id;
		return this;
	}

	MemberPO setName(String name) {
		this.name = name;
		return this;
	}

	MemberPO setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
		return this;
	}

	MemberPO setContact(ContactPO contact) {
		this.contact = contact;
		return this;
	}

	MemberPO setBirthday(LocalDate birthday) {
		this.birthday = birthday;
		return this;
	}
}
