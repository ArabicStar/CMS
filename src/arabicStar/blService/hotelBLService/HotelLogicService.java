package arabicStar.blService.hotelBLService;

import arabicStar.vo.CommentVO;
import arabicStar.vo.HotelVO;
import arabicStar.vo.RoomVO;
/**
 * 这是Hotel逻辑的接口
 * @author jqwu
 *
 */
public interface HotelLogicService {

	public boolean checkIn(RoomVO room);
	
	public boolean checkIn(int orderID);
	
	public boolean checkOut(RoomVO room);	
	
	public boolean comment(CommentVO comment);

	public CommentVO[] getComments(int hotelID);
	
	public boolean updateInfo(HotelVO hotel);
	
	public HotelVO[] search(String scope);
	
	public HotelVO[] sort(HotelVO[] hotels, String sortType);
	

}
