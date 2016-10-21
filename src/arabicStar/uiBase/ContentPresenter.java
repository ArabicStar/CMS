package arabicStar.uiBase;

import javafx.scene.Scene;

/**
 * @author tinke
 * 
 *         The interface of 'changable' page, which means the content on the
 *         page may make some changes as respond to user's operation.<br>
 *         The changes includes: pop a bubble, jump to another page, change the
 *         layout of current content, refresh current content, etc.<br>
 *         Each changes will corresponding to a interface method.<br>
 */
public interface ContentPresenter {

	/**
	 * @param scene
	 *            the Scene which will jump to
	 */
	public void jumpTo(Scene scene);
}
