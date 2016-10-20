package arabicStar.clientlauncher;

import arabicStar.blService.marketBLService.MarketLogicService;
import arabicStar.blService.memberBLService.MemberLogicService;
import arabicStar.blServiceImpl.marketBLServiceImpl.MarketLogicServiceImpl_Stub;
import arabicStar.blServiceImpl.memberBLServiceImpl.MemberLogicServiceImpl_Stub;
import arabicStar.clientcontroller.ClientLogicController;
import arabicStar.clientcontroller.ClientUIController;
import arabicStar.marketui.MarketUIProvider;
import arabicStar.memberui.MemberUIProvider;

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
