package arabicStar.mainui;

import arabicStar.ui.memberui.MemberUIProvider;
import arabicStar.uibase.ContentProvider;
import arabicStar.uibase.UIController;

public class ClientUIController implements UIController {
	ContentProvider memberUiProvider;

	public ClientUIController() {
		init();
	}

	private void init() {
		memberUiProvider = new MemberUIProvider();
	}

	public ContentProvider getProvider(String tag) {
		// stub
		return memberUiProvider;
	}
}
