package structures;

import java.util.Iterator;

import comparators.MaxQueueIntegerComparator;

public class TestDriver {

	public static void main(String[] args) {
		
		MaxQueue<Integer, String> que = new MaxQueue<Integer, String>();		
		que.enqueue(9,"Hi");
		que.enqueue(10,"Hello");
		que.enqueue(2,"Test");
		que.enqueue(1,"Oy");

		Iterator iterator = que.iterator();
		
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
	}
	
}
