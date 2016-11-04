package arabicStar.mainUI;

import arabicStar.uiBase.ContentBridge;
import arabicStar.uiBase.UIController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ClientUI extends Application {
	private static UIController controller;
	private ContentBridge engine;
	private Stage primaryStage;

	public static void setController(UIController controller) {
		ClientUI.controller = controller;
	}

	public void jumpTo(Scene scene) {
		this.primaryStage.setScene(scene);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		engine = new ClientJumpEngine(controller);

		StackPane pane = new StackPane();
		Button b = new Button("Click");// just a demo
		pane.getChildren().add(b);

		engine.registerWidget(b);// register a jump trigger
		primaryStage.setScene(new Scene(pane, 300, 300));
		primaryStage.show();

	}

}
