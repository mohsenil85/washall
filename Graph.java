/*logan mohseni
 * -01449704
 * lab 6:  washall's algorithm
 * the washall() method can find the transitive closure of a graph given an  2 demensional array of nodes
 */
public class Graph {
	private Vertex[] vertices = new Vertex[30];//note the limit of 30 nodes in our graph.  
	private int graphSize = 0;
	private int[][] array;

	private class Vertex {// when i started this, i just had a string of chars to store the names.  but this way is more enterprisey
		char name;
		
		private Vertex(char name) {
			this.name = name;
		}

	}

	public void printGraph() {
		System.out.println();
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

	private void initArr() {//after we know the size of the array, we fill it with zeros, which increment nicerly than nulls
		for (int i = 0; i < graphSize; i++) {
			for (int j = 0; j < graphSize; j++) {
				array[i][j] = 0;
			}
		}
	}

	public void addVertex(char name) {
		Vertex aVertex = new Vertex(name);//object orienteering is good, right?  not sure if it's easier to have
		vertices[graphSize] = aVertex;//a special private class for verticies.  at least this way we can encapsulate their names with their values
		graphSize++;//this variable is used everywhere in the code.  it controls pretty much every single loop in here
		array = new int[graphSize][graphSize];// don't actually know in advance
												// so we just create a new arr
												// each time we add a vertex.
		initArr();//fill the array with zeros
	}

	public void addEdge(int source, int destination) {
		array[source][destination]++;//increment the zeros already exisiting in the array to reflect a new connection
	}//note that this code will break the washall algo code if a person adds multiple connections.  its cray.

	public void washall() {
		for (int i = 0; i < graphSize; i++) {//select a row...
			for (int j = 0; j < graphSize; j++) {//in each column in each row, 
				if (array[i][j] == 1) {//check to see if a connection exists
					for (int k = 0; k < graphSize; k++) {//if a connection is detected,
						if (array[k][i] == 1) {//check everthing that can be reached from that node
							if (array[k][j] < 1){//and if a connection is not already present,
								array[k][j]++;//register that connection
							}
						}
					}
				}
			}
		}
	}
}
