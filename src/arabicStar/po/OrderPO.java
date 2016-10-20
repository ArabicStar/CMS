package arabicStar.po;

import java.util.Date;

public class OrderPO {
	private HotelPO hotel;
	private String number;
	private RoomPO room;
	private Date date;
	
	public HotelPO getHotel() {
		return hotel;
	}

	public RoomPO getRoom() {
		return room;
	}

	public String getNumber() {
		return number;
	}
	
	public Date getDate() {
		return date;
	}

	public void setHotel(HotelPO hotel) {
		this.hotel = hotel;
	}

	public void setRoom(RoomPO room) {
		this.room = room;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}

}
