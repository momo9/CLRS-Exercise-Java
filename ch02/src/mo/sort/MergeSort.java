package mo.sort;

public final class MergeSort {
	public static int inversion(int[] a, int p, int r) {
		if (r-p>1) { // more than one element
			int q = (p+r)/2;
			return inversion(a,p,q)+inversion(a, q, r)+invMerge(a, p, q, r);
		} else {
			return 0;
		}
	}
	
	private static int invMerge(int[] a, int p, int q, int r) {
		int n1 = q-p+1;
		int n2 = r-q+1;
		int[] a1 = new int[n1+1];
		int[] a2 = new int[n2+1];
		for (int i=p; i<q; ++i) {
			a1[i-p] = a[i];
		}
		a1[n1-1] = Integer.MAX_VALUE;
		for (int i=q; i<r; ++i) {
			a2[i-q] = a[i];
		}
		a2[n2-1] = Integer.MAX_VALUE;
		
		int i1=0,i2=0;
		int ret = 0;
		int inc = 0;
		
		for (int i=p; i<r; ++i) {
			if (a1[i1]<a2[i2]) {
				a[i] = a1[i1];
				ret += inc;
				++i1;
			} else {
				a[i] = a2[i2];
				++inc;
				++i2;
			}
		}
		
		return ret;
	}
}
