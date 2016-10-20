package arabicStar.po;

/**
 * This class is the PO of room
 * @author Vivian
 *
 */
public class RoomPO {
	private int type;
	private int number;
	
	public RoomPO(int type, int num){
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
