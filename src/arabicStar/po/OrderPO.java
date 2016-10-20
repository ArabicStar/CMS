package arabicStar.po;


public class OrderPO {
	private HotelPO hotel;
	private String number;
	private RoomPO room;
	
	
	

	public HotelPO getHotel() {
		return hotel;
	}

	public RoomPO getRoom() {
		return room;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
