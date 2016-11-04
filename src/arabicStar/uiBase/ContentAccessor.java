package arabicStar.uiBase;

import javafx.scene.Node;

/**
 * Interface to retrieve content input by user on UI<br>
 * <br>
 * 
 * Typically, the interface will be implented by a nested class in a subclass of
 * ContentProvider<br>
 * The implemention class should contain several getters to retrieve input value
 * in widget on UI, and make basic encapsulation before return<br>
 * The interface method getContent() is used to get the UI which will be shown
 * on the screen<br>
 * 
 * @author tinke
 *
 */
public interface ContentAccessor {
	/**
	 * this method shall firstly check the field isPrepared of outer class, or
	 * return null directly.
	 * 
	 * @return content UI shown on the screen, or null if content UI haven't
	 *         been prepared yet<br>
	 * 
	 */
	public Node getContent();

	public Node getComponent();
}
