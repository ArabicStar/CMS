package arabicStar.clientController;

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
import arabicStar.vo.CreditChangeVO;
import arabicStar.vo.MemberVO;
import arabicStar.vo.OrderVO;
import arabicStar.vo.PromotionVO;
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

	@Override
	public boolean makeNewPromotion(PromotionVO newPromotion) {
		return marketBL.makeNewPromotion(newPromotion);
	}

	@Override
	public PromotionVO[] getCurrentPromotion() {
		return marketBL.getCurrentPromotion();
	}

	@Override
	public boolean deletePromotion(String id) {
		return marketBL.deletePromotion(id);
	}

	@Override
	public boolean updatePromotion(PromotionVO changedPromotion) {
		return marketBL.updatePromotion(changedPromotion);
	}

	@Override
	public PromotionVO getPromotion(String id) {
		return marketBL.getPromotion(id);
	}

	@Override
	public OrderVO[] getAbnormalOrders() {
		return marketBL.getAbnormalOrders();
	}

	@Override
	public OrderVO findAbnornalOrder(String orderID) {
		return marketBL.findAbnornalOrder(orderID);
	}

	@Override
	public boolean rescueOrder(String orderID) {
		return marketBL.rescueOrder(orderID);
	}

	@Override
	public CreditChangeVO chargeCredit(int money) {
		return marketBL.chargeCredit(money);
	}

	@Override
	public boolean updateInfo(MemberVO info) {
		return memberBL.updateInfo(info);
	}

	@Override
	public MemberVO getMemberInfo(String id) {
		return memberBL.getMemberInfo(id);
	}

	@Override
	public CreditChangeVO[] getCreditChanges(String id) {
		return memberBL.getCreditChanges(id);
	}

	@Override
	public OrderVO[] getOrderHistory(String id) {
		return memberBL.getOrderHistory(id);
	}

	@Override
	public boolean login(MemberVO member) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean register(MemberVO member) {
		// TODO 自动生成的方法存根
		return false;
	}
}
