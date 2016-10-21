package arabicStar.blServiceImpl.hotelBLServiceImpl;

import arabicStar.blService.hotelBLService.HotelLogicService;
import arabicStar.blService.promotionBLService.PromotionLogicService;
import arabicStar.vo.CommentVO;
import arabicStar.vo.HotelVO;
import arabicStar.vo.RoomVO;

/**
 * 这是Hotel逻辑的方法实现
 * 
 * @author Vivian
 *
 */
public class HotelLogicServiceImpl_Stub implements HotelLogicService {

	/**
	 * 根据传入的房间信息，查看酒店剩余房间，入住指定房间
	 * 
	 * @return 返回入住结果 TODO: 传入房间
	 */
	@Override
	public boolean checkIn(RoomVO room) {
		// TODO Auto-generated method stub
		System.out.println("成功入住"+room.getName()+room.getType());
		return true;
	}

	/**
	 * 根据传入的房间信息，离开指定房间
	 * 
	 * @return 返回退房结果 TODO: 传入需要退的房间
	 */
	@Override
	public boolean checkOut(RoomVO room) {
		// TODO Auto-generated method stub
		System.out.println("成功离开"+room.getName()+room.getType());
		return true;
	}

	/**
	 * 客户订单执行后，可以对酒店进行评价
	 * 
	 * @return 返回评论结果 TODO: 传入用户的评价与评分VO，现暂时用String替代
	 */
	@Override
	public CommentVO[] getComments(int hotelID) {
		// TODO Auto-generated method stub
//		System.out.println(comment.getMember()+"在"+comment.getTime()+"评价"+comment.getHotel()+" : "+comment.getContent());
		return null;
	}

	/**
	 * 网络管理人员或酒店工作人员对酒店信息进行修改
	 * 
	 * @return 返回修改结果 TODO: 传入新的酒店信息
	 */
	@Override
	public boolean updateInfo(HotelVO hotel) {
		// TODO Auto-generated method stub
		System.out.println("成功更新"+hotel.getName()+"数据");
		return true;
	}

	
	/**
	 * 订单执行
	 * 
	 * @return 返回入住结果
	 */
	@Override
	public boolean checkIn(int orderID) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * 根据商圈搜索酒店
	 * 
	 * @return 返回酒店vo列表
	 */
	@Override
	public HotelVO[] search(String scope) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 根据排序方式给酒店重新排序
	 * 
	 * @return 返回酒店vo列表
	 */
	@Override
	public HotelVO[] sort(HotelVO[] hotels, String sortType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean comment(CommentVO comment) {
		// TODO Auto-generated method stub
		System.out.println(comment.getMember()+"在"+comment.getTime()+"评价"+comment.getHotel()+" : "+comment.getContent());
		return false;
	}

}
