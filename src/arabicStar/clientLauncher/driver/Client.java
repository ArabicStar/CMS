package arabicStar.clientLauncher.driver;

import arabicStar.clientController.ClientLogicController;
import arabicStar.clientLauncher.ClientLauncher;

public class Client {
	public static void main(String[] args) {
		ClientLauncher launcher = new ClientLauncher();
		launcher.init();
		launcher.launch();
		// launcher.start();
		ClientLogicController controller = launcher.getLogicController();

		new MemberLogicService_Driver().driver(controller);
	}
}
