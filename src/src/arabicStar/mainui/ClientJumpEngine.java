package arabicStar.mainui;

import arabicStar.uibase.ContentPresenter;
import arabicStar.uibase.ContentProvider;
import arabicStar.uibase.JumpEngine;
import arabicStar.uibase.UIController;
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
