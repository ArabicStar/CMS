package arabicStar.po;

/**
 * This class is the PO of hotel
 * @author Vivian
 *
 */
public class HotelPO {
	private int star;
	private String phone;
	private String name;
	private String scope;
	private String introduction;
	private double rating;
	private RoomPO[] rooms;
	
	public HotelPO(String name, int star, String phone, String scope, String introduction, double rating, RoomPO[] rooms){
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
