package arabicStar.mainui;

import arabicStar.uiBase.ContentProvider;
import arabicStar.uiBase.UIController;
import memberui.MemberUIProvider;

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
