package arabicStar.util.info.member;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDate;

public abstract class MemberInfo extends MemberInfoTemplate {

	protected boolean isValid;

	private static final String BLANK = "";

	protected MemberInfo(Type type) {
		this.type = type;
		id = BLANK;
		name = BLANK;
		credit = 0;
		contact = null;
		birthday = null;
		enterprise = null;
		isValid = true;
	}

	public String getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public abstract ContactInfo getContact();

	public abstract LocalDate getBirthday();

	public abstract String getEnterprise();

	public boolean isValid() {
		return isValid;
	}
}
