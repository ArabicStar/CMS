package arabicStar.uiBase;

import javafx.scene.Node;
import javafx.scene.control.Dialog;

/**
 * @author tinke
 *
 *         Interface to get Content UI<br>
 *         <br>
 *         The interface used to notify a ContentProvider to make a content UI,
 *         by method prepareXxxPane(), specific to implemention class<br>
 *         Method getContent() used to get the result<br>
 *         Typical usage is Node content =
 *         (XxxUI).prepareXxxPane().getContent();<br>
 */
public interface UI {
	/**
	 * @return prepared content UI
	 * 
	 *         solely call the method ContentAccessor.getContent();
	 */
	public Node getContent();

	public Node getComponent();
}
