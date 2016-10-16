package arabicStar.vo;

public class PromotionVO {
	private String name;
	private String introduction;
	
	public PromotionVO(String name, String introduction){
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
