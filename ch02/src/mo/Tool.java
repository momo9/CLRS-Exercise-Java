package mo;

import java.util.*;

public final class Tool {
	public static void print(int[] a) {
		for (int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static int[] randomSet(int length) {
		HashSet<Integer> set = new HashSet<Integer>(length);
		while (set.size()<length) {
			set.add((int) (Math.random()*20));
		}
		int[] ret = new int[length];
		
		Iterator<Integer> it = set.iterator();
		
		int i=0;
		
		while (it.hasNext()) {
			ret[i++] = it.next();
		}
		
		return ret;
	}
}
