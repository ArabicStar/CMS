package arabicStar.vo;

public class MemberInfo {
	private String name;
	private ContactInfo contact;

	public ContactInfo getContact() {
		return contact;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContact(ContactInfo contact) {
		this.contact = contact;
	}
}
