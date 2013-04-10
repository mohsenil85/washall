/*
 * logan mohseni
 * -01449704
 * lab6
 * driver for washall's algorithm
 */
public class washallApp {
	public static void main(String[] args) {
		Graph theGraph = new Graph();// initizilize an instance of Graph
		//add however many vertices.  note an upper limit of 30 
		theGraph.addVertex('A'); 
		theGraph.addVertex('B'); 
		theGraph.addVertex('C');
		theGraph.addVertex('D');
		theGraph.addVertex('E');
		
		//add edges between various vertices
		//in this case, we just connect each node to his neighbor
		theGraph.addEdge(0, 1); 
		theGraph.addEdge(1, 2); 
		theGraph.addEdge(2, 3); 
		theGraph.addEdge(3, 4); 
		theGraph.addEdge(4, 0); 
		
		System.out.println("Original Adjacency Matrix:  ");
		
		theGraph.printGraph();//what the graph looks like now...
		
		theGraph.washall();//run the algorithm
		
		System.out.println("Transitive Closure:  ");
		
		theGraph.printGraph();//what the graph looks like afterwards.  note that the original array is changed.
		
	}
}
