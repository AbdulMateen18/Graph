public class Stack<T> implements StackInterface<T> {

	private Node1<T> topNode;
	
	
	public Stack(){
		topNode = null;
	}
	
	@Override
	public void push(T entry) {
		// TODO Auto-generated method stub
		Node1<T> n = new Node1<>(entry, topNode);
		topNode = n;
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		T toReturn = peek();
		topNode = topNode.getNextNode();
		return toReturn;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return topNode.getData();
	}

	@Override
	public void clear() {
		topNode = null;
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return topNode == null;
	}

}
