package arabicStar.po;

import arabicStar.util.info.member.ContactInfo;

/**
 * PO of contact<br>
 * use builder to instantiate<br>
 * no public setter, setter only for builder.<br>
 * If needed, use ContactPOBuilder(ContactPO) to edit<br>
 * 
 * @author ClevelandAlto
 *
 */
public class ContactPO extends ContactInfo {

	@Override
	public String getID() {
		return id;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public String getFixedPhone() {
		return fixedPhone;
	}

	@Override
	public String getMobilePhone() {
		return mobilePhone;
	}

	ContactPO setID(String id) {
		this.id = id;
		return this;
	}

	ContactPO setEmail(String email) {
		this.email = email;
		return this;
	}

	ContactPO setFixedPhone(String fixedPhone) {
		this.fixedPhone = fixedPhone;
		return this;
	}

	ContactPO setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
		return this;
	}

	@Override
	public String toString() {
		return "email: " + email + "\nmobile phone: " + mobilePhone + "\nfixed phone: " + fixedPhone;
	}
}
