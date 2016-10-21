package arabicStar.uiBase;

import javafx.event.Event;
import javafx.scene.Scene;

/**
 * @author tinke
 *
 *         The interface for a service can provide a scene(content). It will
 *         handle a user's operation and test whether it should respond to it.
 *         If so, it will return a Scene by method 'prepareContent'. (Context
 *         info needed will be acquire from other interface)<br>
 */
public interface ContentProvider {
	/**
	 * @param e
	 *            user's operation event
	 * @return whether it should respond to the event
	 */
	public boolean ready(Event e);

	/**
	 * @return a scene
	 */
	public Scene prepareContent();
}
