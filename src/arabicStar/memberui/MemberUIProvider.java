package arabicStar.memberui;

import arabicStar.blService.memberBLService.MemberLogicService;
import arabicStar.uibase.ContentProvider;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class MemberUIProvider implements ContentProvider {
	private MemberLogicService memberBL;

	public MemberUIProvider(MemberLogicService memberBL) {
		this.memberBL = memberBL;
	}

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
