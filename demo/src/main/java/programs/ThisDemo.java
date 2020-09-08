package programs;

public class ThisDemo {
 
	ThisDemo(ThisDemo d){
		
		System.out.println("this is int parameter constructor");
		
	}
	
	ThisDemo(){
		
		
		System.out.println("second constrctor");
	}
	int wt;
	int ht;
	
	void test(int wt) {
		this.wt = wt;
		System.out.println(this.wt);
		
		
	}
	
	void test2(ThisDemo d) {
		this.test(10);
	}
	
	ThisDemo test3() {
		this.test2(this);
		return this;
	}
}
