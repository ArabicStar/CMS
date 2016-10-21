package arabicStar.dataService.hotelDataService;

import arabicStar.po.CommentPO;
import arabicStar.po.HotelPO;
import arabicStar.po.RoomPO;

/**
 * 这是Hotel数据的接口
 * @author Vivian
 *
 */
public interface HotelDataService {

	public HotelPO getInfo();

	public double getRating();

	public double getCheap();
	
	public int getStar();
	
	public CommentPO[] getCommets();
	
	public boolean insert(HotelPO po);
	
	public HotelPO find(int id);
	
	public boolean delete(HotelPO po);
	
	public boolean update(HotelPO po);
	
	public boolean setRating(double rating);
	
	public boolean addRooms(RoomPO[] rooms);
	
	public boolean addComment(CommentPO comment);
	
	
}
