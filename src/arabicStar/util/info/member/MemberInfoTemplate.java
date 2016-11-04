package arabicStar.util.info.member;

import java.time.LocalDate;

abstract class MemberInfoTemplate {
	protected enum Type {
		PERSONAL, BUSINESS
	}

	protected Type type;
	protected String id;
	protected String name;
	protected int credit;
	protected ContactInfo contact;
	protected LocalDate birthday;
	protected String enterprise;
}
