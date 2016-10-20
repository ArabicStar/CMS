package arabicStar.mainui;

import arabicStar.uibase.ContentPresenter;
import arabicStar.uibase.JumpEngine;
import arabicStar.uibase.UIController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ClientUI extends Application implements ContentPresenter {
	private static UIController controller;
	private JumpEngine engine;
	private Stage primaryStage;

	public static void setController(UIController controller) {
		ClientUI.controller = controller;
	}

	@Override
	public void jumpTo(Scene scene) {
		this.primaryStage.setScene(scene);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		engine = new ClientJumpEngine(this, controller);

		StackPane pane = new StackPane();
		Button b = new Button("Click");// just a demo
		pane.getChildren().add(b);

		engine.registerWidget(b);// register a jump trigger
		primaryStage.setScene(new Scene(pane, 300, 300));
		primaryStage.show();

	}

}
