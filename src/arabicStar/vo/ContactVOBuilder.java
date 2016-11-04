package arabicStar.vo;

import arabicStar.util.info.member.ContactInfo;

/**
 * Builder for ContactBuilder<br>
 * 
 * @author ClevelandAlto
 *
 */
public class ContactVOBuilder {
	private String id;
	private String email;
	private String mobilePhone;
	private String fixedPhone;

	private static final String BLANK = "";

	public ContactVOBuilder() {
		id = BLANK;
		email = BLANK;
		mobilePhone = BLANK;
		fixedPhone = BLANK;
	}

	/**
	 * Edit a Contact info pack<br>
	 * 
	 * @param info
	 *            info to edit
	 * 
	 */
	public ContactVOBuilder(ContactInfo info) {
		this();
		setEmail(info.getEmail());
		setFixedPhone(info.getFixedPhone());
		setMobilePhone(info.getMobilePhone());
	}

	public ContactVOBuilder setId(String id) {
		if (id.matches("[0-9]{8}"))
			this.id = id;
		return this;
	}

	public ContactVOBuilder setEmail(String email) {
		if (ContactInfo.checkEmail(email))
			this.email = email;
		return this;
	}

	public ContactVOBuilder setFixedPhone(String fixedPhone) {
		if (ContactInfo.checkFixedPhone(fixedPhone))
			this.fixedPhone = fixedPhone;
		return this;
	}

	public ContactVOBuilder setMobilePhone(String mobilePhone) {
		if (ContactInfo.checkMobilePhone(mobilePhone))
			this.mobilePhone = mobilePhone;
		return this;
	}

	public ContactVO getContactVO() {
		return new ContactVO().setID(id).setEmail(email).setFixedPhone(fixedPhone).setMobilePhone(mobilePhone);
	}
}
