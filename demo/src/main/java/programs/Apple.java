package programs;

public class Apple implements InterfaceB{

	
	public static void main(String[] args) {
		Apple apl = new Apple();
		
		if(apl instanceof InterfaceB) {
			apl.show();
		}else {
			System.out.println("No permission");
		}
		
	}

	public void show() {
		System.out.println("show in Apple");
	}
	
}
