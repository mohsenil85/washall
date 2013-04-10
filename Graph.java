public class Graph {
	private Vertex[] vertices = new Vertex[30];
	private int graphSize = 0;
	private boolean oneOrZero = false;
	private int[][] array;
	
	
	private class Vertex{
		char name;
		int index;
		private Vertex(char name, int index){
			this.name = name;
			this.index = index;
		}
		
	}
	
	public void printGraph() {
			System.out.print(" ");
		for (int i = 0; i < graphSize; i++) {
			System.out.print("   ");
			System.out.print(vertices[i].name + "  ");// top line

		}
		System.out.println();
		System.out.print("  ");
		for (int i = 0; i < graphSize; i++) {
			System.out.print("======");// line of equals signs
		}
		System.out.println();
		for (int j = 0; j < graphSize; j++) {// vertical edge
			System.out.print(vertices[j].name + "   ");

			for (int k = 0; k < graphSize; k++) {// stuff inside chart
				System.out.print(array[j][k]);
				System.out.print("     ");
			}
			System.out.println("\n");

		}
		System.out.println();
	}
	
	private void initArr(){
		for(int i = 0; i< graphSize; i++){
			for(int j = 0; j < graphSize; j++){
				array[i][j] = 0;
			System.out.println("boobies");
			}
		}
	}

	public void addVertex(char name) {
		Vertex aVertex = new Vertex(name, graphSize);
		vertices[graphSize] = aVertex;
		graphSize++;
		array = new int[graphSize][graphSize];//don't actually know in advance so we just create a new arr each time we add a vertex.
		initArr();
	}

	public void addEdge(int source, int destination) {
		this.array[source][destination]++;
	}

	public void washall() {

	}

}
