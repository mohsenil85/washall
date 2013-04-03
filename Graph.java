public class Graph {
	private String vertices = "";
	private int graphSize = 0;

	public void printGraph() {
		for (int i = 0; i < graphSize; i++) {
			System.out.print("  ");
			System.out.print(vertices.charAt(i) + "  ");// top line

		}
		System.out.println();
		System.out.print("  ");
		for (int i = 0; i < graphSize; i++) {
			System.out.print("====");// line of equals signs
		}
		System.out.println();
		for (int j = 0; j < graphSize; j++) {// vertical edge
			System.out.print(vertices.charAt(j) + "  ");

			for (int k = 0; k < graphSize; k++) {// stuff inside chart
				System.out.print(" x  ");
			}
			System.out.println();

		}
		System.out.println();
	}

	public String addVertex(char name) {
		graphSize++;
		return vertices += "" + name;// hopefully we only use single char names
										// for our vertices.
	}

	public void addEdge(int source, int destination) {

	}

	public void washall() {

	}

}
