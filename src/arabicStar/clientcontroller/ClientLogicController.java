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
import arabicStar.vo.CommentVO;
import arabicStar.vo.ContactVO;
import arabicStar.vo.CreditChangeVO;
import arabicStar.vo.HotelVO;
import arabicStar.vo.MemberVO;
import arabicStar.vo.OrderVO;
import arabicStar.vo.PromotionVO;
import arabicStar.vo.ResultMessage;
import arabicStar.vo.RoomVO;

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


	public void setHotelBL(HotelLogicService hotelBL) {
		this.hotelBL = hotelBL;
	}

	public void setOrderBL(OrderLogicService orderBL) {
		this.orderBL = orderBL;
	}

	public void setPromotionBL(PromotionLogicService promotionBL) {
		this.promotionBL = promotionBL;
	}

	@Override
	public boolean checkIn(RoomVO room) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkIn(int orderID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkOut(RoomVO room) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean comment(CommentVO comment) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CommentVO[] getComments(HotelVO hotel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateInfo(HotelVO hotel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public HotelVO[] search(String scope) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HotelVO[] sort(HotelVO[] hotels, String sortType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateInfo(MemberVO info) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public MemberVO getMemberInfo(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CreditChangeVO[] getCreditChanges(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderVO[] getOrderHistory(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean makeNewPromotion(PromotionVO newPromotion) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PromotionVO[] getCurrentPromotion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deletePromotion(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePromotion(PromotionVO changedPromotion) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PromotionVO getPromotion(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderVO[] getAbnormalOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderVO findAbnornalOrder(String orderID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean rescueOrder(String orderID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CreditChangeVO chargeCredit(int money) {
		// TODO Auto-generated method stub
		return null;
	}
}
