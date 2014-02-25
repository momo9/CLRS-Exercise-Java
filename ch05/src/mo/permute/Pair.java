package mo.permute;

public class Pair implements Comparable<Pair>{
	
	public int u;
	public int v;
	
	public Pair(int u, int v) {
		this.u = u;
		this.v = v;
	}
	
	public Pair() {
		this(0,0);
	}

	@Override
	public int compareTo(Pair o) {
		// TODO Auto-generated method stub
		Integer lhs = new Integer(u);
		Integer rhs = new Integer(o.u);
		return lhs.compareTo(rhs);
	}
	
}
