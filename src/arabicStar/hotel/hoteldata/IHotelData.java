package arabicStar.hotel.hoteldata;

import arabicStar.hotel.Hotel;

/**
 * 这是Hotel数据的接口
 * @author Vivian
 *
 */
public interface IHotelData {
	/**
	 * 获取酒店信息
	 * @return 所需要的酒店
	 */
	public Hotel getInfo();
	
	/**
	 * 获取酒店的用户评分
	 * @return 用户评分
	 */
	public double getRating();
	
	/**
	 * 获取酒店打过折后的最低房价
	 * @return 最低价格
	 */
	public double getCheap();
	
	/**
	 * 获取酒店的星级
	 * @return 星级
	 */
	public int getStar();
	
}
