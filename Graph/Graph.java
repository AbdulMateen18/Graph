import java.util.LinkedList;

public class Graph {
    int vertex;
    LinkedList<Integer> list[];
    LinkedList<Integer> vertices;

    public Graph(int vertex) {
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for (int i = 0; i <vertex ; i++) {
            list[i] = new LinkedList<>();
        }
        vertices = new LinkedList<>();
    }

    public void addEdge(int source, int destination){
        list[source].add(destination);
        list[destination].add(source);
        if(!vertices.contains(source))
        	vertices.add(source);
        if(!vertices.contains(destination))
        	vertices.add(destination);
    }

    public void printGraph(){
        for (int i = 0; i <vertex ; i++) {
            if(list[i].size()>0) {
                System.out.print("Vertex " + i + " is connected to: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println();
            }
        }
    }
    
    public LinkedList<Integer> getNeighbors(int vertex){
    	LinkedList<Integer> listToReturn = new LinkedList<>();
    	for (int i = 0; i < list[vertex].size() ;i++) {
            listToReturn.add(list[vertex].get(i));
        }
    	return listToReturn;
    }

    public LinkedList<Integer> getVertices() {
    	return this.vertices;
    }
    
    public void bfsTraversal(int startingVertex) {
    	Queue<Integer> queue = new Queue<>();
    	LinkedList<Integer> traversalList = new LinkedList<>();
    	LinkedList<Integer> visited = new LinkedList<>();
		queue.enqueue(startingVertex);
		visited.add(startingVertex);
    	while(!queue.isEmpty()) {
	    	int dequeue = queue.dequeue();
	    	traversalList.add(dequeue);
	    	LinkedList<Integer> neighbors = getNeighbors(dequeue);
	    	for (int i = 0; i < neighbors.size(); i++) {
				if(!visited.contains(neighbors.get(i))) {
					queue.enqueue(neighbors.get(i));
					visited.add(neighbors.get(i));
				}//if
			}//for
    	}
    	
    	for (int i = 0; i < traversalList.size(); i++) {
			System.out.print(traversalList.get(i) + " ");
		}
    	System.out.println();
    }
    
    public void dfsTraversal(int startingVertex) {
    	Stack<Integer> stack = new Stack<>();
    	LinkedList<Integer> traversalList = new LinkedList<>();
    	LinkedList<Integer> visited = new LinkedList<>();
		stack.push(startingVertex);
		//visited.add(startingVertex);
    	while(!stack.isEmpty()) {
	    	int pop = stack.pop();
	    	traversalList.add(pop);
	    	LinkedList<Integer> neighbors = getNeighbors(pop);
	    	for (int i = 0; i < neighbors.size(); i++) {
				if(!visited.contains(neighbors.get(i))) {
					stack.push(neighbors.get(i));
					visited.add(neighbors.get(i));
				}
			}
    	}     	
    	for (int i = 0; i < traversalList.size(); i++) {
			System.out.print(traversalList.get(i) + " ");
		}

    	System.out.println();
    }
}