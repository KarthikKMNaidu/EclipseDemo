package programs;

// Shallow copy
//deep copy
//clone

public class ClonningDemo {
	public static void main(String[] args) throws CloneNotSupportedException {

		ABC abc = new ABC();
		abc.i = 5;
		abc.j = 7;

		System.out.println("First: "+abc.toString());

		ABC abc1 = (ABC) abc.clone();
		abc1.i = 99;

		System.out.println("After copy: "+abc1.toString());
		System.out.println("Second: "+abc.toString());

	}
}

class ABC implements Cloneable{
	int i;
	int j;

	@Override
	public String toString() {
		return "ABC [i=" + i + ", j=" + j + "]";
	}

	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}