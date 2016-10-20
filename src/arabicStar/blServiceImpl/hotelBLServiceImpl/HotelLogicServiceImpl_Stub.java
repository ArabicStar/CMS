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
	private PromotionLogicService promotionBL;

	public HotelLogicServiceImpl_Stub(PromotionLogicService promotionBL) {
		this.promotionBL = promotionBL;
	}

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
	public boolean comment(CommentVO comment) {
		// TODO Auto-generated method stub
		System.out.println(comment.getMember()+"在"+comment.getTime()+"评价"+comment.getHotel()+" : "+comment.getContent());
		return true;
	}

	/**
	 * 网络管理人员完整填写酒店信息后，在酒店列表里新增酒店
	 * 
	 * @return 返回新增结果 TODO: 传入完整酒店信息
	 */
	@Override
	public boolean add(HotelVO hotel) {
		// TODO Auto-generated method stub
		System.out.println("成功"+hotel.getName());
		return true;
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

}
