import java.util.ArrayList;
import java.util.Stack;

/**
 * 
 * @author John George
 *
 */
public class Graph {
	
	//Accepts created nodes.
	Stack<Node> nodeStack = new Stack<Node>();
	Stack<Edge> edgeStack = new Stack<Edge>();
	
	ArrayList<Node> nodeList = new ArrayList<>();
	
	/**
	 * Creates a node and pushes it to the stack.
	 * @param value of the node that will be added.
	 * @param isLeft is true if node belongs to the left side(x).
	 */
	public void inputNode(int value, boolean isLeft){
		Node node = new Node(value, isLeft);
		nodeStack.push(node);
		nodeList.add(node);
		
	}
	
	/**
	 * Create edge.
	 * @param x left node.
	 * @param y right node.
	 */
	public void inputEdge(int x, int y){
		Node left = null;
		Node right = null;
		
		for(Node node : nodeList){
			if(node.getNodeValue() == x && node.isNodeLeft() == true){
				left = node;
			}if(node.getNodeValue() == y && node.isNodeLeft() == false){
				right = node;
			}
		}
		if(left != null && right != null){
			Edge edge = new Edge(left, right);
			edgeStack.push(edge);
			
			System.out.println("You have created a relationship between node " + left.getNodeValue()  + " on the X-side, and node " + right.getNodeValue() + " on the Y-side");
		}else{
			System.out.println("The node or nodes you have assigned are already assigned or do not exist");
		}		
	}
	
	/**
	 * Displays a graph as an adjancy matrix.
	 * @param x two dimensional array.
	 */
	private void display(int x[][]){	
		System.out.print("   ");
		for(int col = 0; col < x.length; col++){		
			System.out.print(col+1+" ");
		}
		System.out.println();
		for(int row = 0; row < x.length; row++){
			System.out.print(row+1+"  ");
			for(int column = 0; column < x[row].length; column++){			
				System.out.print(x[row][column]+" ");
			}
			System.out.println();
		}
	}
	
	/**
	 * Creates a graph by creating a two dimensional array and then rungs pop() on the stack,
	 * to place the edge in the correct position in the array to illustrate connection between nodes.
	 * 
	 */
	private void createGraph(){
		int column = 0;
		int row = 0;
		
		for(Node node : nodeList){
			if(node.isNodeLeft() == false){
				column++;
			}if(node.isNodeLeft() == true){
				row++;	
			}
		}
		
		int[][] newGraph = new int[column][row];
		
		while(edgeStack.size() != 0){
			Edge popEdge = edgeStack.pop();
			
			newGraph[popEdge.getU().getNodeValue()-1][popEdge.getV().getNodeValue()-1] = popEdge.getEdgeValue();			
		}
		
		display(newGraph);
	}
	
	/**
	 * Print the graph.
	 */
	public void printGraph(){
		//display(bpGraph);
		createGraph();
	}
	
	
}
