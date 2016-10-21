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
import arabicStar.vo.HotelVO;
import arabicStar.vo.MemberVO;
import arabicStar.vo.OrderVO;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order born(OrderVO orderInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage die(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage cure(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage ill(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage ripe(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage cancel(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage updateInfo(MemberVO info) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContactVO getContact() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage updateCredit(int increment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCredit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ResultMessage updateInfo(Market market) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkIn(RoomVO room) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkOut(RoomVO room) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean updateInfo(HotelVO hotel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkIn(int orderID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CommentVO[] getComments(int hotelID) {
		// TODO Auto-generated method stub
		return null;
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
	public boolean comment(CommentVO comment) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
