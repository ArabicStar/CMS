package arabicStar.mainui;

import arabicStar.uiBase.ContentPresenter;
import arabicStar.uiBase.ContentProvider;
import arabicStar.uiBase.JumpEngine;
import arabicStar.uiBase.UIController;
import javafx.scene.control.Control;

public class ClientJumpEngine extends JumpEngine {
	private UIController controller;

	public ClientJumpEngine(ContentPresenter presenter, UIController controller) {
		super(presenter);
		this.controller = controller;
	}

	@Override
	public void registerWidget(Control control) {
		ContentProvider provider = controller.getProvider(control.getAccessibleText());
		control.setOnMouseClicked(e -> jump(provider.prepareContent()));
	}
}
