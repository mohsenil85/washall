public class Graph {
	private String vertices = "";
	private int graphSize = 0;
	private boolean oneOrZero = false;
	private int[][] array;
	
	private int[][] initArray(int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				array[i][j] = 0;
			}
		}
		return array;
	}

	public void printGraph() {
		array = initArray(graphSize);
			System.out.print(" ");
		for (int i = 0; i < graphSize; i++) {
			System.out.print("   ");
			System.out.print(vertices.charAt(i) + "  ");// top line

		}
		System.out.println();
		System.out.print("  ");
		for (int i = 0; i < graphSize; i++) {
			System.out.print("======");// line of equals signs
		}
		System.out.println();
		for (int j = 0; j < graphSize; j++) {// vertical edge
			System.out.print(vertices.charAt(j) + "   ");

			for (int k = 0; k < graphSize; k++) {// stuff inside chart
				if (oneOrZero){
				System.out.print(array[j][k]);
				} else {
				System.out.print("0");
				}
				System.out.print("     ");
			}
			System.out.println("\n");

		}
		System.out.println();
	}

	public String addVertex(char name) {
		graphSize++;
		return vertices += "" + name;// hopefully we only use single char names
										// for our vertices.
	}

	public void addEdge(int source, int destination) {
		this.array[source][destination]++;
	}

	public void washall() {

	}

}
