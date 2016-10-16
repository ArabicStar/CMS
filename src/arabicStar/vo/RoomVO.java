package arabicStar.vo;

public class RoomVO {
	private int type;
	private int number;
	
	public RoomVO(int type, int num){
		this.type = type;
		this.number = num;
	}
	
	public int getType(){
		return type;
	}
	
	public int getNumber(){
		return number;
	}
}
