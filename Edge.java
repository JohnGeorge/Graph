/**
 * 
 * @author John George
 *
 */
public class Edge {
	
	private Node u;
	private Node v;
	
	public Edge(Node u, Node v){
		if(u.isNodeLeft() == true){
			setU(u);
		}if(v.isNodeLeft() == false){
			setV(v);
		}else{
			System.out.println("'u' must be the left node and 'v' has to be the right node");
		}	
	}
	
	public Node getU() {
		return u;
	}

	public void setU(Node u) {
		this.u = u;
	}

	public Node getV() {
		return v;
	}

	public void setV(Node v) {
		this.v = v;
	}
	
	public int getEdgeValue(){
		if(u != null && v != null){
			return 1;
		}else{
			return 0;
		}		
	}
}
