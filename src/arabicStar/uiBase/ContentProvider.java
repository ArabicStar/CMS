package arabicStar.uiBase;

import javafx.scene.Node;

/**
 *
 * The interface for a service can provide a scene(content). It will handle a
 * user's operation and test whether it should respond to it. If so, it will
 * return a Scene by method 'prepareContent'. (Context info needed will be
 * acquire from other interface)<br>
 * 
 * @author tinke
 */
public abstract class ContentProvider {
	private boolean isContentReady = false;
	private boolean isDialogReady = false;
	private boolean isComponentReady = false;

	protected boolean isContentReady() {
		return isContentReady;
	}

	protected boolean isDialogReady() {
		return isDialogReady;
	}

	protected boolean isComponentReady() {
		return isComponentReady;
	}

	protected void contentExpire() {
		isContentReady = false;
	}

	protected void dialogExpire() {
		isDialogReady = false;
	}

	protected void componentExpire() {
		isComponentReady = false;
	}

	protected abstract ContentAccessor getAccessor();
}
