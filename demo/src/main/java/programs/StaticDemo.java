package programs;

class Student{
	
static String schoolName = "AIT";
	
	int rollNo;
	String name;
	
	Student(int rollNo, String name){
		
	}
}


public class StaticDemo {

	public static void main(String[] args) {
		
		Student kr = new Student(036, "Karthik");
		
		System.out.println(	kr.name+" "+ kr.rollNo+" "+Student.schoolName);
		
		
	}
	
	
}
