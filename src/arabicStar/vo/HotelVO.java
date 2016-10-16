package arabicStar.vo;


public class HotelVO {
	private int star;
	private String phone;
	private String name;
	private String scope;
	private String introduction;
	private double rating;
	private RoomVO[] rooms;
	
	public HotelVO(String name, int star, String phone, String scope, String introduction, double rating, RoomVO[] rooms){
		this.name = name;
		this.star = star;
		this.phone = phone;
		this.scope = scope;
		this.introduction = introduction;
		this.rating = rating;
		this.rooms = rooms.clone();
	}
	
	public String getName(){
		return name;
	}
	
	public String getPhone(){
		return phone;
	}
	
	public String getIntroduction(){
		return introduction;
	}
	
	public String getScope(){
		return scope;
	}
	
	public double getRating(){
		return rating;
	}
	
	public int getStar(){
		return star;
	}
	
}
