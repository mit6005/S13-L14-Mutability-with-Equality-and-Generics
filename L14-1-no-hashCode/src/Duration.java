
public class Duration {
	private final int min, sec;
	public Duration(int m, int s) {
			min = m;
			sec = s;
	}
	
	public int getSecs() {
		return min*60 + sec; 
	}
	
    @Override 
	public boolean equals (Object _that) {
	   // also handles _that == null
		 if (!(_that instanceof Duration)) return false; 
		 Duration that = (Duration) _that;
		 return this.getSecs() == that.getSecs();
	}
        
	public static void main(String[] args) {
		Duration d1 = new Duration(1,2);
		Duration d2 = new Duration(1,2);

		System.out.println(d1.equals(d2));
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
	}
}
