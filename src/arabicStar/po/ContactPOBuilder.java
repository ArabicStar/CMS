package arabicStar.po;

import arabicStar.util.info.member.ContactInfo;

/**
 * Builder for ContactPO<br>
 * 
 * @author ClevelandAlto
 *
 */
public class ContactPOBuilder {
	private String id;
	private String email;
	private String mobilePhone;
	private String fixedPhone;

	private static final String BLANK = "";

	public ContactPOBuilder() {
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
	public ContactPOBuilder(ContactInfo info) {
		this();
		setEmail(info.getEmail());
		setFixedPhone(info.getFixedPhone());
		setMobilePhone(info.getMobilePhone());
	}

	public ContactPOBuilder setId(String id) {
		if (id.matches("[0-9]{8}"))
			this.id = id;
		return this;
	}

	public ContactPOBuilder setEmail(String email) {
		if (ContactInfo.checkEmail(email))
			this.email = email;
		return this;
	}

	public ContactPOBuilder setFixedPhone(String fixedPhone) {
		if (ContactInfo.checkFixedPhone(fixedPhone))
			this.fixedPhone = fixedPhone;
		return this;
	}

	public ContactPOBuilder setMobilePhone(String mobilePhone) {
		if (ContactInfo.checkMobilePhone(mobilePhone))
			this.mobilePhone = mobilePhone;
		return this;
	}

	public ContactPO getContactPO() {
		return new ContactPO().setID(id).setEmail(email).setFixedPhone(fixedPhone).setMobilePhone(mobilePhone);
	}
}
