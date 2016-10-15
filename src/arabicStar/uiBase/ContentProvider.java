package arabicStar.uiBase;

import javafx.event.Event;
import javafx.scene.Scene;

public interface ContentProvider {
	public boolean ready(Event e);

	public Scene prepareContent();
}
