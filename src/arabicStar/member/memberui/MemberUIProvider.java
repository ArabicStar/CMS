package arabicStar.member.memberui;

import arabicStar.uiBase.ContentProvider;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class MemberUIProvider implements ContentProvider {

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
