package arabicStar.clientcontroller;

import arabicStar.mainui.ClientUI;
import arabicStar.marketui.MarketUIProvider;
import arabicStar.uibase.ContentProvider;
import arabicStar.uibase.UIController;
import javafx.application.Application;

public class ClientUIController implements UIController {
	private ContentProvider memberUI, marketUI;
	private ContentProvider currentContent;

	public ClientUIController(ClientLogicController logicController) {
	}

	public void start() {
		ClientUI.setController(this);
		Application.launch(ClientUI.class, "");
	}

	public ContentProvider getProvider(String tag) {
		// stub
		return memberUI;
	}

	public void setMarketUI(MarketUIProvider marketUI) {
		this.marketUI = marketUI;
	}

	public void setMemberUI(ContentProvider memberUI) {
		this.memberUI = memberUI;
	}
}
