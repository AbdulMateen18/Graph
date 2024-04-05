public class Node1<T> {
	private T data;
	private Node1<T> nextNode;
	
	public Node1(T data, Node1 next){
		this.setData(data);
		this.setNextNode(next);
	}
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node1<T> getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node1<T> nextNode) {
		this.nextNode = nextNode;
	}
	
	
}
