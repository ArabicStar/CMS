package arabicStar.hotel.hoteldataservice;

import arabicStar.hotel.Hotel;
import arabicStar.hotel.hoteldata.IHotelData;

/**
 * 这是Hotel数据的方法实现
 * @author Vivian
 *
 */
public class HotelDataService implements IHotelData {

	@Override
	public Hotel getInfo() {
		// TODO Auto-generated method stub
		System.out.println("Get INFO");
		return null;
	}

	@Override
	public double getRating() {
		// TODO Auto-generated method stub
		System.out.println("Get RATING");
		return 0;
	}

	@Override
	public double getCheap() {
		// TODO Auto-generated method stub
		System.out.println("Get CHEAPEST");
		return 0;
	}

	@Override
	public int getStar() {
		// TODO Auto-generated method stub
		System.out.println("Get STAR");
		return 0;
	}

}
