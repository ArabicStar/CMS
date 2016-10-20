package arabicStar.clientcontroller;

import arabicStar.mainui.ClientUI;
import arabicStar.ui.memberui.MemberUIProvider;
import arabicStar.uibase.ContentProvider;
import arabicStar.uibase.UIController;
import javafx.application.Application;

public class ClientUIController implements UIController {
	ContentProvider memberUiProvider;

	public ClientUIController(ClientLogicController logicController) {
		init();
	}

	private void init() {
		memberUiProvider = new MemberUIProvider();
		ClientUI.setController(this);
		Application.launch(ClientUI.class, "");
	}

	public ContentProvider getProvider(String tag) {
		// stub
		return memberUiProvider;
	}
}
