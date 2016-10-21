package arabicStar.data.hotelDataService;

import arabicStar.po.CommentPO;
import arabicStar.po.HotelPO;
import arabicStar.po.RoomPO;

/**
 * 这是Hotel数据的接口
 * @author Vivian
 *
 */
public interface HotelDataService {

	public HotelPO getInfo(int hotelID);
	
	public double getCheap(int hotelID);
	
	public boolean insert(HotelPO po);
	
	public HotelPO[] find(String scope);
	
	public boolean delete(int hotelID);
	
	public boolean update(int hotelID,HotelPO po);
	
	public boolean addRooms(int hotelID,RoomPO[] rooms);
	
	public boolean addComment(int hotelID,CommentPO comment);
	
	
}
