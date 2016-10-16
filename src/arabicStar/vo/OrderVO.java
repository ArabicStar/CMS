package arabicStar.vo;


/**
 * 订单信息类，是生成订单时传入的参数
 * @author WaterWan
 * TODO:还有属性没有添加
 */
public class OrderVO {
	private HotelVO hotel;
	
	private RoomVO room;

	public HotelVO getHotel() {
		return hotel;
	}

	public void setHotel(HotelVO hotel) {
		this.hotel = hotel;
	}

	public RoomVO getRoom() {
		return room;
	}

	public void setRoom(RoomVO room) {
		this.room = room;
	}
	
	

}
