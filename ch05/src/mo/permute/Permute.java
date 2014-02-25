package mo.permute;

import java.util.*;

public final class Permute {
	
	public static void bySorting(int[] a) {

		
		ArrayList<Pair> l = new ArrayList<Pair>(a.length);
		
		int range = (int)Math.pow(a.length, 3);
		
		for (int i=0; i<a.length; ++i) {			
			l.add(new Pair((int)(Math.random()*range), a[i]));
		}
		
		Collections.sort(l);
				
		for (int i=0; i<a.length; ++i) {
			a[i] = l.get(i).v;
		}
	}

	public static void inPlace(int[] a) {
		for (int i=0; i<a.length; ++i) {
			swap(a,i,rand(i,a.length));
		}
	}
	
	private static void swap(int[] a, int i1, int i2) {
		int t = a[i2];
		a[i2] = a[i1];
		a[i1] = t;
	}
	
	private static int rand(int low, int high) {
		int range = high-low;
		return (int)(Math.random()*range+low);
	}
	
}
