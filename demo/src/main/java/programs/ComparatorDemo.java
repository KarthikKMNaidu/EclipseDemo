package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		List<Integer> intValues = new ArrayList<Integer>();
		intValues.add(2);
		intValues.add(15);
		intValues.add(21);
		intValues.add(19);
		intValues.add(27);
		intValues.add(6);

		/*
		 * Comparator<Integer> com = new Comparator<Integer>() {
		 * 
		 * @Override public int compare(Integer o1, Integer o2) {
		 * 
		 * if (o1 > o2) return 1;
		 * 
		 * return -1; } };
		 */

		Collections.sort(intValues, (o1, o2) -> {
			if (o1 > o2)
				return 1;
			return -1;
		});

		for (Integer integer : intValues) {
			System.out.println(integer);
		}

	}

}
