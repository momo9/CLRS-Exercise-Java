package mo.subarray;

public class SubArrayPara{
	public int low;
	public int high;
	public int sum;
	
	public SubArrayPara(int low, int high, int sum) {
		// TODO Auto-generated constructor stub
		this.low = low;
		this.high = high;
		this.sum = sum;
	}
	
	public boolean notLessThan(SubArrayPara rhs) {
		return this.sum >= rhs.sum;
	}
	
}
