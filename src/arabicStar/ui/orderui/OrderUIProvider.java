package arabicStar.ui.orderui;

import arabicStar.uiBase.ContentProvider;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

/**
 * 参考组长的写法
 * @author WaterWan
 *
 */
public class OrderUIProvider implements ContentProvider {

	@Override
	public boolean ready(Event e) {
		// stub
		return true;
	}

	@Override
	public Scene prepareContent() {
		// stub
		StackPane p = new StackPane();
		Label l = new Label("Done");
		p.getChildren().add(l);
		return new Scene(p, 300, 300);
	}

}
