package arabicStar.vo;

public class MemberVO {
	private String name;
	private ContactVO contact;

	public ContactVO getContact() {
		return contact;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContact(ContactVO contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "name:" + name + "\ncontact:" + contact.toString();
	}
}
