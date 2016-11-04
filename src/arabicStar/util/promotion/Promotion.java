package arabicStar.util.promotion;

/**
 * 这是Promotion的具体类
 * 
 * @author Vivian
 *
 */
public class Promotion {
	private String id;

	public enum Owner {
		HOTEL, WEBSITE
	}// indicate which owner the promotion belongs to

	public enum Application {
		ENTERPRISE, PERSONAL
	}// indicate which kind of user this promotion will be applied to

	public enum Condition {
		UPTO, ANYTIME, SEPCIFIC
	}// indicate in which condition the promotion will be applied

	public enum Discount {
		PERCENT, NUMBER
	}// indicate how the promotion works when being applied to order
}
