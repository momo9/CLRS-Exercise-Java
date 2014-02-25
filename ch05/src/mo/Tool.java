package mo;

public final class Tool {
	public static void print(int[] a) {
		for (int i:a) {
			System.out.print(i+",");
		}
		System.out.println();
	}
	
	public static int[] genArray(int length) {
		int[] ret = new int[length];
		
		for (int i=0; i<ret.length; ++i) {
			ret[i] = (int)(Math.random()*20);
		}
		
		return ret;
	}
}
