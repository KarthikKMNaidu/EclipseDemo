package programs;

public class RunnableDemo {
	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hi");
			}
		}, "Hiiii");

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello");
			}
		}, "Helloooo");

		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		t2.start();

		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());

//		t1.join();
//		t2.join();

		System.out.println("Bye guy's");

	}
}
