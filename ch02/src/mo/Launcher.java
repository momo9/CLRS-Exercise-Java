package mo;

import mo.sort.*;

public final class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Launcher().go();
	}
	
	private void go() {
//		int[] a = Tool.randomSet(5);
		int[] a = {6,5,4,3,2,1};
		Tool.print(a);
		
		System.out.println(MergeSort.inversion(a, 0, a.length));
	}

}
