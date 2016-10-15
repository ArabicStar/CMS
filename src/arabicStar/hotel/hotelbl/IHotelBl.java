package arabicStar.hotel.hotelbl;

import arabicStar.hotel.Hotel;
import arabicStar.hotel.Room;
/**
 * 这是Hotel逻辑的接口
 * @author Vivian
 *
 */
public interface IHotelBl {
	/**
	 * 根据传入的房间信息，查看酒店剩余房间，入住指定房间
	 * @return 返回入住结果
	 * TODO: 传入房间
	 */
	public boolean checkIn(Room room);
	
	/**
	 * 根据传入的房间信息，离开指定房间
	 * @return 返回退房结果
	 * TODO: 传入需要退的房间
	 */
	public boolean checkOut(Room room);
	
	/**
	 * 客户订单执行后，可以对酒店进行评价
	 * @return 返回评论结果
	 * TODO: 传入用户的评价与评分VO，现暂时用String替代
	 */
	public boolean comment(String comments);
	
	/**
	 * 网络管理人员完整填写酒店信息后，在酒店列表里新增酒店
	 * @return 返回新增结果
	 * TODO: 传入完整酒店信息
	 */
	public boolean add(Hotel hotel);
	
	/**
	 * 网络管理人员或酒店工作人员对酒店信息进行修改
	 * @return 返回修改结果
	 * TODO: 传入新的酒店信息
	 */
	public boolean updateInfo(Hotel hotel);

}
