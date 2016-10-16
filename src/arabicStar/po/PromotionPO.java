package arabicStar.po;

public class PromotionPO {

	private String name;
	private String introduction;
	
	public PromotionPO(String name, String introduction){
		this.name = name;
		this.introduction = introduction;
	}
	
	public String getName(){
		return name;
	}
	
	public String getIntroduction(){
		return introduction;
	}
}
