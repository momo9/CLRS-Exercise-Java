package mo;

import mo.subarray.*;

public final class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] price = Tool.genData(10000000);
//		int[] price = {13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
//		Tool.print(price);	
		
		long start = System.currentTimeMillis();
		SubArrayPara p = FindSubArray.maxSubArray(new SubArrayPara(0, price.length, 0), price);
		long end = System.currentTimeMillis();
		long last0 = end-start;
//		System.out.println(p.low+","+p.high+","+p.sum);
		
		start = System.currentTimeMillis();
		p = FindSubArray.dynamicProgramming(price);
		end = System.currentTimeMillis();
		long last1 = end-start;
//		System.out.println(p.low+","+p.high+","+p.sum);
		System.out.println(last0+","+last1);

	}

}
