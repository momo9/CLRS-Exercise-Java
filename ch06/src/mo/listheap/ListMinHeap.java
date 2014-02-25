package mo.listheap;

import java.util.*;

public class ListMinHeap {
	
	protected ArrayList<LinkedList<Integer>> a = new ArrayList<LinkedList<Integer>>();
	
	public void setAndMake(ArrayList<LinkedList<Integer>> a) {
		this.a = a;
		makeHeap();
	}
	
	public void print() {
		for (LinkedList<Integer> ll:a) {
			for (Integer i:ll) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	public void delete(int i) {
		a.set(i, a.get(a.size()-1));
		a.remove(a.size()-1);
		downShift(i);
	}
	
	public LinkedList<Integer> merge() {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		while (!a.isEmpty()) {
			ll.add(a.get(0).removeFirst());
			if (a.get(0).isEmpty()) {
				delete(0);
			} else {
				downShift(0);
			}
		}
		return ll;
	}
	
	protected void makeHeap() {
		for (int i=((a.size()-2)>>1); i>=0; --i) {
			downShift(i);
		}
	}
	
	protected void downShift(int i) {
		int l = getLeft(i);
		int r = getRight(i);
		if (l<a.size()) {
			int largest = i;
			if (getVal(l)<getVal(largest)) {
				largest = l;
			}
			if (r<a.size() && getVal(r)<getVal(largest)) {
				largest = r;
			}
			
			if (largest==i) {
				return;
			} else {
				swap(largest,i);
				downShift(largest);
			}
			
		} else {
			return;
		}
	}

	protected int getLeft(int i) {
		return (i<<1)+1;
	}
	
	protected int getRight(int i) {
		return (i<<1)+2;
	}

	
	protected void swap(int i, int j) {
		LinkedList<Integer> temp = a.get(i);
		a.set(i, a.get(j));
		a.set(j, temp);
	}
	
	protected Integer getVal(int i) {
		return a.get(i).getFirst();
	}

	
}
