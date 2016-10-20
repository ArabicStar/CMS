package arabicStar.clientlauncher;

import arabicStar.bl.memberBLService.MemberLogicService;
import arabicStar.clientcontroller.ClientLogicController;
import arabicStar.clientcontroller.ClientUIController;

public class ClientLauncher {
	public void launch() {
		MemberLogicLauncher msLauncher = new MemberLogicLauncher();
		MemberLogicService mls = msLauncher.launch();

		ClientLogicController logicController = new ClientLogicController();

		logicController.setMemberLogicController(mls);

		ClientUIController uiController = new ClientUIController(logicController);
	}

	public static void main(String[] args) {
		new ClientLauncher().launch();
	}
}
