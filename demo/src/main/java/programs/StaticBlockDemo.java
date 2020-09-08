package programs;

public class StaticBlockDemo {

	static float PI;
	
	static
	{
		
		System.out.println("SIB 1");
	}
	
	static {
	
		System.out.println("SIB 2");
		
	}
	
	static {
		
		System.out.println("SIB 3");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main method");
	}
	
	static {
		
		System.out.println("SIB 4");
	}
}
