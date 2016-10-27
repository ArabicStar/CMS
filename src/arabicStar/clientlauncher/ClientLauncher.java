package arabicStar.clientlauncher;

import arabicStar.blService.hotelBLService.HotelLogicService;
import arabicStar.blService.marketBLService.MarketLogicService;
import arabicStar.blService.memberBLService.MemberLogicService;
import arabicStar.blService.orderBLService.OrderLogicService;
import arabicStar.blService.promotionBLService.PromotionLogicService;
import arabicStar.blServiceImpl.hotelBLServiceImpl.HotelLogicServiceImpl_Stub;
import arabicStar.blServiceImpl.marketBLServiceImpl.MarketLogicServiceImpl_Stub;
import arabicStar.blServiceImpl.memberBLServiceImpl.MemberLogicServiceImpl_Stub;
import arabicStar.blServiceImpl.orderBLServiceImpl.OrderLogicServiceImpl_Stub;
import arabicStar.blServiceImpl.promotionBLServiceImpl.PromotionLogicServiceImpl_Stub;
import arabicStar.clientcontroller.ClientLogicController;
import arabicStar.clientcontroller.ClientUIController;
import arabicStar.ui.marketui.MarketUIProvider;
import arabicStar.ui.memberui.MemberUIProvider;

public class ClientLauncher {
	private ClientLogicController logicController;
	private ClientUIController uiController;
	// private DataAccessObject dao;

	public void init() {
		logicController = new ClientLogicController();
		uiController = new ClientUIController(logicController);
		// dao=RMIHelper.getDAO; //DAO shall be retrieved from rmi
	}

	public void launch() {
		launchMemberModule();
		launchMarketModule();
		launchPromotionModule();
		launchOrderModule();
		launchHotelModule();
	}

	private void launchHotelModule() {
		launchHotelLogic();

	}

	private void launchHotelLogic() {
		HotelLogicService hotelLogicService = new HotelLogicServiceImpl_Stub(logicController);
		logicController.setHotelBL(hotelLogicService);
	}

	private void launchOrderModule() {
		launchOrderLogic();
	}

	private void launchOrderLogic() {
		OrderLogicService orderService = new OrderLogicServiceImpl_Stub(logicController, logicController);
		logicController.setOrderBL(orderService);
	}

	private void launchPromotionModule() {
		launchPromotionLogic();
	}

	private void launchPromotionLogic() {
		// promotion depend no other module
		PromotionLogicService promotionService = new PromotionLogicServiceImpl_Stub();
		logicController.setPromotionBL(promotionService);
	}

	// launch market module
	private void launchMarketModule() {
		launchMarketLogic();
		launchMarketUI();
	}

	private void launchMarketLogic() {
		MarketLogicService marketService = new MarketLogicServiceImpl_Stub(logicController, logicController);
		logicController.setMarketBL(marketService);
	}

	private void launchMarketUI() {
		uiController.setMarketUI(new MarketUIProvider(logicController));
	}

	// launch member module
	private void launchMemberModule() {
		launchMemberLogic();
		launchMemberUI();
	}

	private void launchMemberUI() {
		uiController.setMemberUI(new MemberUIProvider(logicController));
	}

	private void launchMemberLogic() {
		MemberLogicService memberBL = new MemberLogicServiceImpl_Stub(logicController, logicController);
		logicController.setMemberBL(memberBL);
	}

	public void start() {
		uiController.start();
	}

	public ClientLogicController getLogicController() {// just for debug
		return logicController;
	}
	// public static void main(String[] args) {
	// ClientLauncher launcher = new ClientLauncher();
	// launcher.init();
	// launcher.launch();
	//// launcher.start();
	// launcher.logicController.comment("aaaa");
	// }
}
