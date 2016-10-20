package arabicStar.blService.hotelBLService;

import arabicStar.vo.HotelVO;
import arabicStar.vo.RoomVO;
/**
 * 这是Hotel逻辑的接口
 * @author jqwu
 *
 */
public interface HotelLogicService {

	public boolean checkIn(RoomVO room);
	
	public boolean checkOut(RoomVO room);	

	public boolean comment(String comments);

	public boolean add(HotelVO hotel);
	
	public boolean updateInfo(HotelVO hotel);

}
