public interface StackInterface<T> {
	public abstract void push(T entry);
	public abstract T pop();
	public abstract T peek();
	public abstract void clear();
	public abstract boolean isEmpty();
}

