package arabicStar.po;


public class MemberPO {

	private String name;
	private ContactPO contact;

	public ContactPO getContact() {
		return contact;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContact(ContactPO contact) {
		this.contact = contact;
	}
}
