package comparators;

import java.util.Comparator;

public class MaxQueueIntegerComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1 < o2) return -1;
		if(o2 > o1 ) return 1;
		return o1.compareTo(o2);
	}
	

}
