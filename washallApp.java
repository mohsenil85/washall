
public class washallApp {
	public static void main(String[] args) {
		Graph theGraph = new Graph();
		theGraph.addVertex('A'); 
		theGraph.addVertex('B'); 
		theGraph.addVertex('C');
		System.out.println("Original Adjacency Matrix");
		theGraph.printGraph();
	}
}
