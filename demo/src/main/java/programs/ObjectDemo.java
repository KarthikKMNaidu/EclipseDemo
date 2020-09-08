package programs;

public class ObjectDemo {

	int a = 20, b1 = 60;
	
	
	static int b = 30;
	
	public static void main(String[] args) {
		
		ObjectDemo od = new ObjectDemo();
		
		System.out.println(od.a);
		
		od.a =40;
		
		System.out.println();
		od.test1();
		
		ObjectDemo od1 = new ObjectDemo();
		
		System.out.println(od1.a);
		
		
		System.out.println(new ObjectDemo().a = 50);
		
		System.out.println(od1.a);
	}
	
	static void test() {
		
		System.out.println("This is test method");
	}
	void test1() {
		
		System.out.println("This is test1 method");
	}
}
