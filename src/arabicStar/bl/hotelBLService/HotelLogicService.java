package arabicStar.bl.hotelBLService;

import arabicStar.util.hotel.Hotel;
import arabicStar.util.hotel.Room;
/**
 * 这是Hotel逻辑的接口
 * @author jqwu
 *
 */
public interface HotelLogicService {

	public boolean checkIn(Room room);
	
	public boolean checkOut(Room room);	

	public boolean comment(String comments);

	public boolean add(Hotel hotel);
	
	public boolean updateInfo(Hotel hotel);

}
