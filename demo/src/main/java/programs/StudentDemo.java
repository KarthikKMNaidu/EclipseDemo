package programs;

public class StudentDemo implements Comparable<StudentDemo>{

	String Name;
	int rollNo;
	int marks;
	
	
	public StudentDemo(String name, int rollNo, int marks) {
		super();
		Name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentDemo [Name=" + Name + ", rollNo=" + rollNo + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(StudentDemo arg) {
		return (this.marks>arg.marks)?-1:1;
	}
	
	
	
}
