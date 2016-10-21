package arabicStar.uiBase;
/**
 * @author Clef
 * @version 0.1
 * Used to define page jumping logic.<br>
 * Bound to ContentPresenter instance.<br>
 * Only care about send the jump request, ignore the requset of data from logic layer.<br>
 * Notice a certain widget is allowed to be registered once.<br>
 */

import java.util.List;

import javafx.scene.Scene;
import javafx.scene.control.Control;

/**
 * @author tinke
 *
 *         Controller for page jumping
 */
public abstract class JumpEngine {
	protected ContentPresenter presenter;
	protected List<Control> widgets;

	public JumpEngine(ContentPresenter presenter) {
		this.presenter = presenter;

	}

	public abstract void registerWidget(Control control);

	protected void jump(Scene scene) {
		presenter.jumpTo(scene);
	}
}
