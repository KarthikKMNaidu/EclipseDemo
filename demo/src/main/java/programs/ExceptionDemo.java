package programs;

public class ExceptionDemo {
	public static void main(String[] args) {
		int i = 8;
		int j = 0;
		int k = 0;

		try {
			k = i / j;
			System.out.println(k);
		} catch (ArithmeticException e) {
			System.out.println("RuntimeException : " + e);
		} catch (Exception e) {
			System.out.println("Exception : " + e);
		}

		/*
		 * try (BufferedReader br = new BufferedReader(new
		 * InputStreamReader(System.in))) { String ss = br.readLine(); }
		 */

//		int i = 5;
//
//		try {
//			if (i < 10) {
//				throw new MyException("Value is less than 5");
//			}
//		}catch (MyException e) {
//			System.out.println("MyException : " + e);
//		}  catch (Exception e) {
//			System.out.println("Exception : " + e);
//		}

		
		
		
		
		
		
		
	}//Main method
}

//class MyException extends Exception {
//
//	public MyException(String errMsg) {
//		super(errMsg);
//	}
//
//}
