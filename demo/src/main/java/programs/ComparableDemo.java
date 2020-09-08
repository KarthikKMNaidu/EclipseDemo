package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
	public static void main(String[] args) {
		
		List<StudentDemo> sd = new ArrayList<StudentDemo>();
		
		sd.add(new StudentDemo("Chethan", 1, 68));
		sd.add(new StudentDemo("Pruthvin", 2, 88));
		sd.add(new StudentDemo("Onkar", 3, 78));
		sd.add(new StudentDemo("Karthik", 4, 58));
		
		Collections.sort(sd);
		
		for (StudentDemo studentDemo : sd) {
			System.out.println(studentDemo);

		}
		

	}
}
