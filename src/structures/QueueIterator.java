package structures;

import java.util.*;

public class QueueIterator<P,V>  implements Iterator<V>{
    
	private AbstractAH<P,V> heap;
	public QueueIterator(AbstractAH<P,V> heap){
		this.heap=heap;
		
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return !heap.isEmpty();
	}

	@Override
	public V next() {
		// TODO Auto-generated method stub
		return  heap.remove();
	}

}
