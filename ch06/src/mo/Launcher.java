package mo;

import java.util.*;

import mo.heap.*;
import mo.listheap.*;
import mo.priorqueue.*;
import mo.young.*;


public final class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Launcher().go4();
//		Tool.rand(5, 20);
		
	}
	
//	private void go1() {
//		int[] a = {34,2,56,32,12,5,13,19};
//
//		PriorityQueue pq = new PriorityQueue(64);
//		pq.setAndMake(a);
//		
//		pq.print();
//		
//		pq.increase(40);
//		pq.print();
//		
//	}
	
	private void go2() {
		int[] a = {34,2,56,32,12,5,13,19};
		Heap h = new Heap(64);
		h.setAndMake(a);
		h.print();
		
		h.delete(0);
		h.print();
		h.print();
	}
	
	private void go3() {
		Integer[][] array = {
				{3,2,4,23,24},
				{0,9,21,21,27},
				{9,9,14,25},
				{1,19,29},
				{2,7,17},
				{1,9,29}
		};
		
		ArrayList<LinkedList<Integer>> a = new ArrayList<LinkedList<Integer>>();
		
		for (int i=0; i<array.length; ++i) {
			a.add(new LinkedList<Integer>());
			for (int j=0; j<array[i].length; ++j) {
				a.get(i).add(array[i][j]);
			}
		}
		
		ListMinHeap lmh = new ListMinHeap();
		lmh.setAndMake(a);
		lmh.print();
		LinkedList<Integer> l = lmh.merge();
		
		for (Integer i:l) {
			System.out.print(i+" ");
		}
		System.out.println();
		
	}
	
	private void go4() {
		
		int[][] array = {
				{3,5,7,10,15},
				{4,8,16,17,18},
				{6,14,19,20,21}
		};
		
		YoungMatrix ym = new YoungMatrix(array);
		ym.print();
		
		int[] ret = ym.find(2);
		if (ret!=null) {
			System.out.println(ret[0]+","+ret[1]);
		} else {
			System.out.println("Cannot find.");
		}
		
		
//		for (int i=0; i<10 ; ++i) {
//			ym.extractMin();
//			ym.print();
//		}
		
	}

}
