package mo;

import java.io.*;
import java.util.*;

import mo.permute.*;


public final class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new Launcher().go1();
//		new Launcher().go2();
		new Launcher().go4();
	}
	
	private void go1() {
		
		int[] a = new int[10];
		for (int i=0; i<a.length; ++i) {
			a[i] = i;
		}
		Tool.print(a);
		
		Permute.bySorting(a);
		Tool.print(a);
		
	}

	private void go2() {
		int[] a = new int[10];
		for (int i=0; i<a.length; ++i) {
			a[i] = i;
		}
		Tool.print(a);
		
		Permute.inPlace(a);
		Tool.print(a);
		
	}
	
	private void go3() {
		
		Parent p = new Parent(50, "Yh", Gender.FEMALE);
		
		try {
			FileOutputStream fos = new FileOutputStream("p.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(p);
			
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		p = new Parent();	
		
		try {
			FileInputStream fis = new FileInputStream("p.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			try {
				p = (Parent) ois.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(p.getName()+": "+p.getAge()+","+p.getGender());
		
		
	}
	
	
	private void go4() {
		
		final int NUM = 1000;
		
		double n = 12.0;
		
		double q = 0.5;
		double p = 0.5;
		double sum = 0.0;
		
		for (int i=0; i<NUM; ++i) {
			sum += (i+2)*p;
			p *= q;
		}
		
		System.out.println(sum);
		
	}
	
	
}
