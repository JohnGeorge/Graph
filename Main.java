/**
 * 
 * @author John George
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Graph g = new Graph();
		
		//X-side.
		g.inputNode(1, true);
		g.inputNode(2, true);
		g.inputNode(3, true);
		g.inputNode(4, true);
		g.inputNode(5, true);
		g.inputNode(6, true);		
		
		//Y-side.
		g.inputNode(1, false);
		g.inputNode(2, false);
		g.inputNode(3, false);
		g.inputNode(4, false);
		g.inputNode(5, false);
		g.inputNode(6, false);

		//Edge
		g.inputEdge(1, 5);
		g.inputEdge(5, 3);
		g.inputEdge(2, 6);
		g.inputEdge(5, 6);
		g.inputEdge(4, 2);
		g.inputEdge(6, 1);
		
		g.printGraph();		
	}
}

