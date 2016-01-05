/**
 * 
 * @author John George
 *
 */
public class Node {
	
	private int nodeValue;
	private boolean nodeIsLeft;
	
	public Node(int nodeValue, boolean nodeIsLeft){
		setNodeValue(nodeValue);
		setNodeLeft(nodeIsLeft);
	}

	public int getNodeValue() {
		return nodeValue;
	}

	public void setNodeValue(int nodeValue) {
		this.nodeValue = nodeValue;
	}

	public boolean isNodeLeft() {
		return nodeIsLeft;
	}

	public void setNodeLeft(boolean nodeIsLeft) {
		this.nodeIsLeft = nodeIsLeft;
	}
	
	
	
}
