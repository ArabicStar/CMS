package arabicStar.vo;

/**
 * This class is the PO of room
 * @author Vivian
 *
 */
public class RoomVO {
	private String name;
	private int price;
	private int type;
	private int number;
	
	public RoomVO(String name, int price, int type, int num){
		this.name = name;
		this.price = price;
		this.type = type;
		this.number = num;
	}
	
	public int getType(){
		return type;
	}
	
	public int getNumber(){
		return number;
	}
	
	public int getPrice(){
		return price;
	}
	
	public String getName(){
		return name;
	}

}
