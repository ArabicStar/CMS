package arabicStar.util.info.member;

public abstract class MemberInfoBuilder extends MemberInfoTemplate {
	public MemberInfoBuilder(String type) {
		this.type = Type.valueOf(type);
	}
}
