public interface QueueInterface<T>
{
	void enqueue(T entry);
	T dequeue();
	T getFront();
	boolean isEmpty();
	void clear();
}