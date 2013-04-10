
public class washallApp {
	public static void main(String[] args) {
		Graph theGraph = new Graph();
		theGraph.addVertex('A'); 
		theGraph.addVertex('B'); 
		theGraph.addVertex('C');
		theGraph.addVertex('D');
		theGraph.addVertex('E');
		
		System.out.println("Original Adjacency Matrix");
		
//		theGraph.addEdge(0, 2); 
//		theGraph.addEdge(1, 0); 
//		theGraph.addEdge(1, 4); 
//		theGraph.addEdge(3, 4); 
//		theGraph.addEdge(4, 2);
		
		theGraph.addEdge(0, 1); 
		theGraph.addEdge(1, 2); 
		theGraph.addEdge(2, 3); 
		theGraph.addEdge(3, 4); 
		theGraph.addEdge(4, 0);
		
		theGraph.printGraph();
		
		theGraph.washall();
		
		theGraph.printGraph();
		
	}
}
