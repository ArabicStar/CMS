package arabicStar.vo;

import arabicStar.util.info.member.ContactInfo;

/**
 * 
 * VO of contact<br>
 * use builder to instantiate<br>
 * no public setter, setter only for builder.<br>
 * If needed, use ContactVOBuilder(ContactVO) to edit<br>
 * 
 * @author tinke
 *
 */
public class ContactVO extends ContactInfo {

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

	ContactVO setID(String id) {
		this.id = id;
		return this;
	}

	ContactVO setEmail(String email) {
		this.email = email;
		return this;
	}

	ContactVO setFixedPhone(String fixedPhone) {
		this.fixedPhone = fixedPhone;
		return this;
	}

	ContactVO setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
		return this;
	}

	@Override
	public String toString() {
		return "email: " + email + "\nmobile phone: " + mobilePhone + "\nfixed phone: " + fixedPhone;
	}
}
