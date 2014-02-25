package mo;

import java.util.*;

public class Tool {

	private Tool() {
		
	}
	
	public static void print(int[] a) {
		for (int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void rand(int num, int range) {
		ArrayList<Integer> a = new ArrayList<Integer>(num);
		for (int i=0; i<num; ++i) {
			a.add((int)(Math.random()*range));
		}
		Collections.sort(a);
		for (Integer i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
}
