package programs;

public class OperatorsDemo {

	public static void main(String[] args) {
		
		int a = 1;
		
		int b = 2;
		
		int c = ++a + a++ + b++ + ++b;
		
		     	System.out.println(c);
		     	
		   b += 7;
		   
		   System.out.println(20>>3);
		   
		    String result = (a>b)?"yes":"no";
			System.out.println(result);
	}
	
	public static void test() {
		
		return;
	}
}