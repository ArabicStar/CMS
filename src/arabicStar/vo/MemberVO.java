package arabicStar.vo;

import java.time.LocalDate;

import arabicStar.util.info.member.MemberInfo;

/**
 * VO of member<br>
 * Immutable<br>
 * 
 * @author ClevelandAlto
 *
 */
public final class MemberVO extends MemberInfo {
	MemberVO() {
		super();
		isValid = true;
	}

	@Override
	public String getID() {
		if (isValid)
			return id;
		return null;
	}

	@Override
	public String getName() {
		if (isValid)
			return name;
		return null;
	}

	@Override
	public ContactVO getContact() {
		if (isValid)
			return new ContactVOBuilder(contact).getContactVO();
		return null;
	}

	@Override
	public LocalDate getBirthday() {
		if (isValid)
			return birthday;
		return null;
	}

	MemberVO setID(String id) {
		this.id = id;
		return this;
	}

	MemberVO setName(String name) {
		this.name = name;
		return this;
	}

	MemberVO setContact(ContactVO contact) {
		this.contact = contact;
		return this;
	}

	MemberVO setBirthday(LocalDate birthday) {
		this.birthday = birthday;
		return this;
	}

	void invalidate() {
		isValid = false;
	}

	@Override
	public String toString() {
		return "name:" + name + "\ncontact:" + contact.toString();
	}
}
