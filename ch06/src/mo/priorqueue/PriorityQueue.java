package mo.priorqueue;

import mo.heap.*;

public class PriorityQueue extends Heap{

	public PriorityQueue(int capacity) {
		// TODO Auto-generated constructor stub
		super(capacity);
	}
	
	public int maximum() {
		return a[0];
	}
	
	public int extractMax() {
		
		if (size==0) {
			System.out.println("Heap Underflow");
			return -1;
		}
		
		int ret = a[0];
		
		swap(0,size-1);
		--size;
		downShift(0);
		
		return ret;
	}
	
	public void increase(int num) {
		a[size] = num;
		++size;
		upShift(size-1);
	}
	
	protected void upShift(int i) {
		if (i==0) {
			return;
		}
		int p = getParent(i);
		if (a[i]>a[p]) {
			swap(i,p);
			upShift(p);
		}
	}
	

}
