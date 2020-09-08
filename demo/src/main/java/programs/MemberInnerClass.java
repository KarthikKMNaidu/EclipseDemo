package programs;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class MemberInnerClass {

	public static void main(String[] args) {

		B obj = new B() {

			public void show() {
				System.out.println("Hi");
			}
		};
		obj.show();
		obj.showDD();

		C objC = () -> System.out.println("Interface c");
		objC.show();


	}

}

class B {
	public void show() {
		System.out.println("Hello");
	}

	public void showDD() {
		System.out.println("Hello 22");
	}

}

interface C {
	void show();
}
