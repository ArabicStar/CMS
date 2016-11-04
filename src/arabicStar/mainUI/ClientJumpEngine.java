package arabicStar.mainUI;

import arabicStar.uiBase.ContentProvider;
import arabicStar.uiBase.ContentBridge;
import arabicStar.uiBase.UIController;
import javafx.scene.control.Control;

public class ClientJumpEngine extends ContentBridge {
	private UIController controller;

	public ClientJumpEngine(UIController controller) {
		super();
		this.controller = controller;
	}

	@Override
	public void registerWidget(Control control) {
		ContentProvider provider = controller.getProvider(control.getAccessibleText());
	}
}
