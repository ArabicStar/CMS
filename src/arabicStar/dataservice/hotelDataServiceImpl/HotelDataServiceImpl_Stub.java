package arabicStar.dataservice.hotelDataServiceImpl;

import arabicStar.data.hotelDataService.HotelDataService;
import arabicStar.po.CommentPO;
import arabicStar.po.HotelPO;
import arabicStar.po.RoomPO;

/**
 * 这是Hotel数据的方法实现
 * @author Vivian
 *
 */
public class HotelDataServiceImpl_Stub implements HotelDataService {

	/**
	 * 获取酒店信息
	 * @return 所需要的酒店
	 */
	@Override
	public HotelPO getInfo(int hotelID) {
		// TODO Auto-generated method stub
		System.out.println("Get INFO");
		return null;
	}


	@Override
	public boolean insert(HotelPO po) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public double getCheap(int hotelID) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public HotelPO[] find(String scope) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int hotelID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(int hotelID, HotelPO po) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addRooms(int hotelID, RoomPO[] rooms) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addComment(int hotelID, CommentPO comment) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
