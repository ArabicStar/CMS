package arabicStar.vo;

import java.util.Date;

import arabicStar.util.hotel.Hotel;
import arabicStar.util.hotel.Room;

/**
 * 订单信息类，是生成订单时传入的参数
 * @author WaterWan
 * TODO:还有属性没有添加
 */
public class OrderVO {
	private Hotel hotel;
	
	private Room room;
	
	private int stayDays;
	
	private Date startDate;// TODO:自己实现一个Date

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public int getStayDays() {
		return stayDays;
	}

	public void setStayDays(int stayDays) {
		this.stayDays = stayDays;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	

}
