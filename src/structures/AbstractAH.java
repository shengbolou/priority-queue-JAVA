package structures;


import java.util.Comparator;

public class AbstractAH<p,v> extends AbstractArrayHeap<p,v>{




	public AbstractAH(Comparator<p> comparator) {
		super(comparator);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int getLeftChildOf(int index) {
		// TODO Auto-generated method stub
		if(index < 0) throw new IndexOutOfBoundsException();
		return (index*2)+1;
	}

	@Override
	protected int getRightChildOf(int index) {
		// TODO Auto-generated method stub
		if(index < 0) throw new IndexOutOfBoundsException();
		return (index*2)+2;
	}

	@Override
	protected int getParentOf(int index) {
		// TODO Auto-generated method stub
		if(index < 1) throw new IndexOutOfBoundsException();
		return (index-1)/2;
	}

	@Override
	protected void bubbleUp(int index) {

		while(index > 0 && this.getComparator().compare(this.asList().get(index).getPriority(),
				this.asList().get(getParentOf(index)).getPriority()) > 0){

			swap(index,getParentOf(index));
			index=getParentOf(index);

		}

		// TODO Auto-generated method stub

	}

	@Override
	protected void bubbleDown(int index) {	
		while(getLeftChildOf(index) < size()){
			int largest=getLeftChildOf(index);

			if(getRightChildOf(index) < size() && 
					this.getComparator().compare(this.asList().get(getLeftChildOf(index)).getPriority(),
							this.asList().get(getRightChildOf(index)).getPriority()) < 0
					) 
				largest=getRightChildOf(index);

			if(this.getComparator().compare(this.asList().get(index).getPriority(),
					this.asList().get(largest).getPriority()) < 0)
				swap(index,largest);
			else {
				break;
			}
			index=largest;
		}
		// TODO Auto-generated method stub

	}

}