package arabicStar.dataServiceImpl.hotelDataServiceImpl;

import arabicStar.dataService.hotelDataService.HotelDataService;
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
	public HotelPO getInfo() {
		// TODO Auto-generated method stub
		System.out.println("Get INFO");
		return null;
	}

	/**
	 * 获取酒店的用户评分
	 * @return 用户评分
	 */
	@Override
	public double getRating() {
		// TODO Auto-generated method stub
		System.out.println("Get RATING");
		return 0;
	}

	/**
	 * 获取酒店打过折后的最低房价
	 * @return 最低价格
	 */
	@Override
	public double getCheap() {
		// TODO Auto-generated method stub
		System.out.println("Get CHEAPEST");
		return 0;
	}

	/**
	 * 获取酒店的星级
	 * @return 星级
	 */
	@Override
	public int getStar() {
		// TODO Auto-generated method stub
		System.out.println("Get STAR");
		return 0;
	}

	@Override
	public CommentPO[] getCommets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(HotelPO po) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public HotelPO find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(HotelPO po) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(HotelPO po) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setRating(double rating) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addRooms(RoomPO[] rooms) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addComment(CommentPO comment) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
