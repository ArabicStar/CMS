package arabicStar.blservice.hotelblservice;

import arabicStar.bl.hotelbl.HotelBL;
import arabicStar.util.hotel.Hotel;
import arabicStar.util.hotel.Room;

/**
 * 这是Hotel逻辑的方法实现
 * @author Vivian
 *
 */
public class HotelBLService implements HotelBL {

	/**
	 * 根据传入的房间信息，查看酒店剩余房间，入住指定房间
	 * @return 返回入住结果
	 * TODO: 传入房间
	 */
	@Override
	public boolean checkIn(Room room) {
		// TODO Auto-generated method stub
		System.out.println("成功入住");
		return true;
	}

	/**
	 * 根据传入的房间信息，离开指定房间
	 * @return 返回退房结果
	 * TODO: 传入需要退的房间
	 */
	@Override
	public boolean checkOut(Room room) {
		// TODO Auto-generated method stub
		System.out.println("成功退房");
		return true;
	}

	/**
	 * 客户订单执行后，可以对酒店进行评价
	 * @return 返回评论结果
	 * TODO: 传入用户的评价与评分VO，现暂时用String替代
	 */
	@Override
	public boolean comment(String comments) {
		// TODO Auto-generated method stub
		System.out.println("成功评价");
		return true;
	}

	/**
	 * 网络管理人员完整填写酒店信息后，在酒店列表里新增酒店
	 * @return 返回新增结果
	 * TODO: 传入完整酒店信息
	 */
	@Override
	public boolean add(Hotel hotel) {
		// TODO Auto-generated method stub
		System.out.println("成功新增酒店");
		return true;
	}

	/**
	 * 网络管理人员或酒店工作人员对酒店信息进行修改
	 * @return 返回修改结果
	 * TODO: 传入新的酒店信息
	 */
	@Override
	public boolean updateInfo(Hotel hotel) {
		// TODO Auto-generated method stub
		System.out.println("成功更新酒店数据");
		return true;
	}

}
