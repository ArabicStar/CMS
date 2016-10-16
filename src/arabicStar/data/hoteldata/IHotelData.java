package arabicStar.data.hoteldata;

import arabicStar.util.hotel.Hotel;

/**
 * 这是Hotel数据的接口
 * @author Vivian
 *
 */
public interface IHotelData {

	public Hotel getInfo();

	public double getRating();

	public double getCheap();
	
	public int getStar();
	
}
