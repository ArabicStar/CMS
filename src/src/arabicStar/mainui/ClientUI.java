package arabicStar.mainui;

import arabicStar.uiBase.ContentPresenter;
import arabicStar.uiBase.JumpEngine;
import arabicStar.uiBase.UIController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ClientUI extends Application implements ContentPresenter {
	private UIController controller;
	private JumpEngine engine;
	private Stage primaryStage;

	public ClientUI() {
		controller = new ClientUIController();
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
		Button b = new Button("Click");
		pane.getChildren().add(b);

		engine.registerWidget(b);
		primaryStage.setScene(new Scene(pane, 300, 300));
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
