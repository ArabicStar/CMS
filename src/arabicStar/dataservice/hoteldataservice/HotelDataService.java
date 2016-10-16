package arabicStar.dataservice.hoteldataservice;

import arabicStar.data.hoteldata.HotelData;
import arabicStar.util.hotel.Hotel;
import arabicStar.po.HotelPO;

/**
 * 这是Hotel数据的方法实现
 * @author Vivian
 *
 */
public class HotelDataService implements HotelData {

	/**
	 * 获取酒店信息
	 * @return 所需要的酒店
	 */
	@Override
	public Hotel getInfo() {
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

	public void insert(HotelPO po){
		System.out.println("Insert Succeed!");
	}

	public void delete(HotelPO po){
		System.out.println("Delete Succeed!");
	}

	public void update(HotelPO po){
		System.out.println("Update Succeed!");
	}

	public HotelPO find(int id){
		System.out.println("Find Succeed!");
		HotelPO po = new HotelPO(null,0,null,null,null,0,null);
		return po;
	}
}
