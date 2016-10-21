package arabicStar.clientcontroller;

import arabicStar.blService.hotelBLService.HotelLogicService;
import arabicStar.blService.marketBLService.MarketLogicService;
import arabicStar.blService.memberBLService.MemberLogicService;
import arabicStar.blService.orderBLService.OrderLogicService;
import arabicStar.blService.promotionBLService.PromotionLogicService;
import arabicStar.util.hotel.Hotel;
import arabicStar.util.hotel.Room;
import arabicStar.util.market.Market;
import arabicStar.util.order.Order;
import arabicStar.vo.ContactVO;
import arabicStar.vo.MemberVO;
import arabicStar.vo.OrderVO;
import arabicStar.vo.ResultMessage;

public class ClientLogicController
		implements HotelLogicService, MarketLogicService, MemberLogicService, OrderLogicService, PromotionLogicService {
	private MarketLogicService marketBL;
	private MemberLogicService memberBL;
	private PromotionLogicService promotionBL;
	private OrderLogicService orderBL;
	private HotelLogicService hotelBL;

	public ClientLogicController() {
	}

	public void setMarketBL(MarketLogicService marketBL) {
		if (this.marketBL == null)
			this.marketBL = marketBL;
	}

	public void setMemberBL(MemberLogicService memberBL) {
		this.memberBL = memberBL;
	}

	@Override
	public Order apply(Order order) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Order born(OrderVO orderInfo) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public ResultMessage die(Order order) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public ResultMessage cure(Order order) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public ResultMessage ill(Order order) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public ResultMessage ripe(Order order) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public ResultMessage cancel(Order order) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public ResultMessage updateInfo(MemberVO info) {
		System.out.println("user new info:\n" + info.toString());
		return null;
	}

	@Override
	public String getName() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public ContactVO getContact() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public ResultMessage updateCredit(int increment) {
		int credit = 100;
		System.out.println("Original credit is " + credit);
		System.out.println("Increased by " + increment);
		credit += increment;
		System.out.println("Now is " + credit);
		return null;
	}

	@Override
	public int getCredit() {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public ResultMessage updateInfo(Market market) {
		return null;
	}

	@Override
	public boolean checkIn(Room room) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean checkOut(Room room) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean comment(String comments) {
		System.out.println(comments);
		return false;
	}

	@Override
	public boolean add(Hotel hotel) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean updateInfo(Hotel hotel) {
		// TODO 自动生成的方法存根
		return false;
	}

	public void setHotelBL(HotelLogicService hotelBL) {
		this.hotelBL = hotelBL;
	}

	public void setOrderBL(OrderLogicService orderBL) {
		this.orderBL = orderBL;
	}

	public void setPromotionBL(PromotionLogicService promotionBL) {
		this.promotionBL = promotionBL;
	}
}
