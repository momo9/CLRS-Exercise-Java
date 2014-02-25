package mo.subarray;

public final class FindSubArray {
	public static SubArrayPara maxSubArray(SubArrayPara para, int[] a) {
		
		if (para.high-1 == para.low) {
			return new SubArrayPara(para.low, para.high, a[para.low]);
		} else {
			int mid = (para.low+para.high)/2;			
			SubArrayPara arrayLeft = maxSubArray(new SubArrayPara(para.low, mid, 0), a);
			SubArrayPara arrayMid = maxCrossing(para, a);
			SubArrayPara arrayRight = maxSubArray(new SubArrayPara(mid, para.high, 0), a);

			if (arrayLeft.notLessThan(arrayMid) && arrayLeft.notLessThan(arrayRight)) {
				return arrayLeft;
			} else if (arrayMid.notLessThan(arrayLeft) && arrayMid.notLessThan(arrayRight)) {
				return arrayMid;
			} else {
				return arrayRight;
			}		
			
		}
		
	}
	
	private static SubArrayPara maxCrossing(SubArrayPara para, int[] a) {
		
		int mid = (para.low+para.high)/2;
		
		int sumTemp = 0;
		int sumLeft = Integer.MIN_VALUE;
		int low = mid-1;
		
		for (int i=mid-1; i>=para.low; --i) {
			sumTemp += a[i];
			if (sumTemp > sumLeft) {
				sumLeft = sumTemp;
				low = i;
			}
		}
		
		int sumRight = Integer.MIN_VALUE;
		sumTemp = 0;
		int high = mid+1;
		
		for (int i=mid; i<para.high; ++i) {
			sumTemp += a[i];
			if (sumTemp > sumRight) {
				sumRight = sumTemp;
				high = i+1;
			}
		}
		
		return new SubArrayPara(low, high, sumLeft+sumRight);
	}
	
	public static SubArrayPara dynamicProgramming(int[] a) {
	
		int low = 0;
		int high = 1;
		int lowI = 0;
		int sumA = a[0];
		int sumI = a[0];
		
		for (int i=1; i<a.length; ++i) {
			if (sumI>0) {
				sumI += a[i];
			} else {
				sumI = a[i];
				lowI = i;
			}
			
			if (sumI>sumA) {
				low = lowI;
				high = i+1;
				sumA = sumI;
			}
		}
		
		return new SubArrayPara(low, high, sumA);
	}
}
