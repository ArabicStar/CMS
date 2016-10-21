package arabicStar.clientlauncher.driver;

import arabicStar.clientcontroller.ClientLogicController;
import arabicStar.clientlauncher.ClientLauncher;

public class Client {
	public static void main(String[] args) {
		ClientLauncher launcher = new ClientLauncher();
		launcher.init();
		launcher.launch();
		// launcher.start();
		ClientLogicController controller = launcher.getLogicController();

		new MemberLogicService_Driver().driver(controller);
		new HotelLogicService_Driver().driver(controller);
	}
}
