package programs;


import java.io.IOException;

public class StringDemo {

	public static void main(String[] args) throws IOException {

		StringBuffer sb = new StringBuffer();
		sb.append("Hi");

		StringBuilder sbb = new StringBuilder("abc");
		sbb.append("hgg");

		System.out.println(sbb);

		

	}

}
