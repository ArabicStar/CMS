package arabicStar.hotel.hotelbl;

import arabicStar.hotel.Hotel;
import arabicStar.hotel.Room;
/**
 * 这是Hotel逻辑的接口
 * @author Vivian
 *
 */
public interface IHotelBl {

	public boolean checkIn(Room room);
	
	public boolean checkOut(Room room);	

	public boolean comment(String comments);

	public boolean add(Hotel hotel);
	
	public boolean updateInfo(Hotel hotel);

}
