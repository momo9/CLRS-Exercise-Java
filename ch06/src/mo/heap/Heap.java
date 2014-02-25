package mo.heap;

public class Heap {

	protected int[] a;
	protected int capacity;
	protected int size = 0;
	
	public static final void heapSort(int[] a) {
		
		Heap h = new Heap(0);
		h.set(a);
		h.makeHeap();
		
		for (int i=a.length-1; i>0; --i) {
			h.swap(0,i);
			--h.size;
			h.downShift(0);
		}
		
	}
	
	public Heap(int capacity) {
		a = new int[capacity];
		this.capacity = capacity;
	}
	
	public int getCapacity() {
		return capacity;
	}

	public int getSize() {
		return size;
	}
	
	public void print() {
		for (int i=0; i<size; ++i) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	

	public void setAndMake(int[] a) {
		set(a);
		makeHeap();
	}
	
	public void delete(int i) {
		a[i] = a[size-1];
		--size;
		downShift(i);
	}

	protected void set(int[] a) {
		if (a.length<capacity) {
			size = a.length;
			for (int i=0; i<size; ++i) {
				this.a[i] = a[i];
			}
		} else {
			capacity = a.length;
			size = a.length;
			this.a = a;
		}
	}
	
	
	protected void makeHeap() {
		for (int i=((size-2)>>1); i>=0; --i) {
			downShift(i);
		}
	}
	
	protected void downShiftNonRecursion(int i) {
		int largest = i;
		do {
			i = largest;
			int l = getLeft(i);
			int r = getRight(i);
			if (l<size) {
				if (a[l]>a[largest]) {
					largest = l;
				}
				if (r<size && a[r]>a[largest]) {
					largest = r;
				}
			}
			swap(largest,i);
		} while (largest!=i);
	}
	
	
	protected void downShift(int i) {
		int l = getLeft(i);
		int r = getRight(i);
		if (l<size) {
			int largest = i;
			if (a[l]>a[largest]) {
				largest = l;
			}
			if (r<size && a[r]>a[largest]) {
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
	
	protected void swap(int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	protected int getParent(int i) {
		return (i-1)>>1;
	}
	
	protected int getLeft(int i) {
		return (i<<1)+1;
	}
	
	protected int getRight(int i) {
		return (i<<1)+2;
	}
	
}
