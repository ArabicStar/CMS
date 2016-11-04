package arabicStar.util.info.member;

public abstract class ContactInfo {
	protected String id;
	protected String email;
	protected String mobilePhone;
	protected String fixedPhone;

	protected boolean isValid;

	private static final String BLANK = "";

	private static final String EMAIL_PATTERN = "\\w+@\\w+\\.\\w+";
	private static final String MOBILE_PHONE_PATTERN = "[0-9]{11}";
	private static final String FIXED_PHONE_PATTERN = "[0-9]{3,4}-[0-9]{8}";

	protected ContactInfo() {
		email = BLANK;
		mobilePhone = BLANK;
		fixedPhone = BLANK;
	}

	public abstract String getEmail();

	public abstract String getMobilePhone();

	public abstract String getFixedPhone();

	public abstract String getID();

	public boolean isValid() {
		return isValid;
	}

	public static final boolean checkEmail(String email) {
		return email != null && email.matches(EMAIL_PATTERN);
	}

	public static final boolean checkMobilePhone(String mobilePhone) {
		return mobilePhone != null && mobilePhone.matches(MOBILE_PHONE_PATTERN);
	}

	public static final boolean checkFixedPhone(String fixedPhone) {
		return fixedPhone != null && fixedPhone.matches(FIXED_PHONE_PATTERN);
	}
}
