package mo;

public final class Tool {

	public static int[] genData(int num) {
		int[] ret = new int[num];
		for (int i=0; i<num; ++i) {
			ret[i] = (int)((Math.random()-0.45)*20);
		}
		return ret;
	}
	
	public static void print(int[] data) {
		for (int i:data) {
			System.out.println(i);
		}
	}
	
}
