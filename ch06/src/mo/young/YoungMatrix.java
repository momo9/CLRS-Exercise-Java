package mo.young;

public class YoungMatrix {
	
	protected int a[][];
	protected int m;
	protected int n;
	
	public YoungMatrix(int a[][]) {
		this.a = a;
		m = a.length;
		n = a[0].length;
	}
	
	public void setVal(int i, int j, int num) {
		a[i][j] = num;
	}
	
	public int getVal(int i, int j) {
		return a[i][j];
	}
	
	public void print() {
		for (int i=0; i<a.length; ++i) {
			for (int j=0; j<a[i].length; ++j) {
				String s;
				if (a[i][j] == Integer.MAX_VALUE) {
					s = String.format("%4s", "Inf");
				} else {
					s = String.format("%4d", a[i][j]);
				}
				System.out.print(s);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public int extractMin() {
		int ret = a[0][0];
		int i=0;
		int j=0;
		
		while ((i!=m-1 && a[i+1][j]!=Integer.MAX_VALUE) ||
				(j!=n-1 && a[i][j+1]!=Integer.MAX_VALUE)) {
		
			if (i==m-1) {
				a[i][j] = a[i][j+1];
				++j;
				continue;
			}
			if (j==n-1) {
				a[i][j] = a[i+1][j];
				++i;
				continue;
			}
			if (a[i][j+1]<a[i+1][j]) {
				a[i][j] = a[i][j+1];
				++j;
			} else {
				a[i][j] = a[i+1][j];
				++i;
			}
		}
		
		a[i][j] = Integer.MAX_VALUE;
		
		return ret;
	}
	
	public int[] find(int val) {
		
		int i=0;
		int j=n-1;
		
		while (i<m || j>=0) {
			if (a[i][j]==val) {
				int[] ret = {i,j};
				return ret;
			}
			if (val<a[i][j]) {
				if (j==0) {
					return null;
				} else {
					--j;
				}
			} else {
				if (i==m-1) {
					return null;
				} else {
					++i;
				}
			}
		}
		
		return null;
	}
	
	
}
