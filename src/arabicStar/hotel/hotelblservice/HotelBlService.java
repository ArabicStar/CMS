package arabicStar.hotel.hotelblservice;

import arabicStar.hotel.Hotel;
import arabicStar.hotel.Room;
import arabicStar.hotel.hotelbl.IHotelBl;
import arabicStar.order.Order;

/**
 * 这是Hotel逻辑的方法实现
 * @author Vivian
 *
 */
public class HotelBlService implements IHotelBl {

	@Override
	public boolean checkIn(Room room) {
		// TODO Auto-generated method stub
		System.out.println("成功入住");
		return true;
	}

	@Override
	public boolean checkOut(Room room) {
		// TODO Auto-generated method stub
		System.out.println("成功退房");
		return true;
	}

	@Override
	public boolean comment(String comments) {
		// TODO Auto-generated method stub
		System.out.println("成功评价");
		return true;
	}

	@Override
	public boolean add(Hotel hotel) {
		// TODO Auto-generated method stub
		System.out.println("成功新增酒店");
		return true;
	}

	@Override
	public boolean updateInfo(Hotel hotel) {
		// TODO Auto-generated method stub
		System.out.println("成功更新酒店数据");
		return true;
	}
	
}
