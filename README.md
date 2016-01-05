#Graph
Graph written in Java represented as adjancy matrix, for those of us who find them fun =)

###How to use.
Simply add nodes to the matrix by calling the inputNode(nodeValue, leftOrRight) method assigning it a value between 1 and 6,
and true or false depending if you want the node to be on the left side or right side.
Finally add an edge to connect the two nodes by callind the inputEdge(leftNode, rightNode) method.
```java
Graph g = new Graph();
    	//left node.
		g.inputNode(1, true);
		//right  node.
		g.inputNode(2, false);
		//Connecting edge.
		g.inputEdge(1, 2);
```
###Output.
Output will be printed out in the console where every connection you make will be printed out followed by the matrix itself.
The upper row of numbers will be the right nodes and the left row will be the left nodes. 0 means no connection and 1 means that a connection exists between the nodes.
####Example output.
```java
You have created a relationship between node 1 on the X-side, and node 5 on the Y-side
You have created a relationship between node 4 on the X-side, and node 2 on the Y-side
You have created a relationship between node 6 on the X-side, and node 1 on the Y-side
   1 2 3 4 5 6 
1  0 0 0 0 1 0 
2  0 0 0 0 0 0 
3  0 0 0 0 0 0 
4  0 1 0 0 0 0 
5  0 0 0 0 0 0 
6  1 0 0 0 0 0 
```
