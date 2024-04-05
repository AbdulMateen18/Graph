public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph(7);
        graph.addEdge(0,1);
        graph.addEdge(0,5);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(3,4);
        graph.addEdge(4,5);
        graph.addEdge(6,6);
        //graph.addEdge(7,6);
        graph.printGraph();

        // System.out.print("BFS: ");
        // graph.bfsTraversal(1);
         System.out.print("DFS: ");
         graph.dfsTraversal(1);
	}

}
