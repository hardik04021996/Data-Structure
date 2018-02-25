package DataStructures;

public class GraphUse {

	public static void main(String[] args) throws StackEmptyException {
		Graph g = new Graph();
		g.addVertex("G");
		g.addVertex("A");
		g.addVertex("B");
		g.addVertex("C");
		g.addVertex("D");
		g.addVertex("E");
		g.addVertex("F");
		g.addVertex("H");
		g.addEdge("A", "B");
		g.addEdge("A", "C");
		g.addEdge("B", "D");
		g.addEdge("C", "D");
		g.addEdge("C", "E");
		g.addEdge("C", "F");
		//g.addEdge("G", "H");


		//g.removeVertex("A");
		//g.removeEdge("D", "C");
		//	g.print();
		//boolean result= g.isconnected();
		//System.out.println(result);
		g.dfs();



	}

}
