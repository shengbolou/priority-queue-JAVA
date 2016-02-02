package structures;


import java.util.Comparator;
import java.util.Iterator;

import comparators.MinQueueIntegerComparator;

public class MinQueue<P,V> implements PriorityQueue<P,V>{


	private MinQueueIntegerComparator min;
	private AbstractAH<P,V> heap;
	


	public MinQueue(){
		min=new MinQueueIntegerComparator();
		heap=new AbstractAH(min);
		
	}
	@Override
	public PriorityQueue<P, V> enqueue(P priority, V value) {
		// TODO Auto-generated method stub
		heap.add(priority, value);
		return this;
	}

	@Override
	public V dequeue() {
		// TODO Auto-generated method stub
		return heap.remove();
	}

	@Override
	public V peek() {
		// TODO Auto-generated method stub
		return heap.peek();
	}

	@Override
	public Iterator<Entry<P, V>> iterator() {
		// TODO Auto-generated method stub
		return new QueueIterator(heap);
	}

	@Override
	public Comparator<P> getComparator() {
		// TODO Auto-generated method stub
		return heap.getComparator();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return heap.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return heap.isEmpty();
	}

}
