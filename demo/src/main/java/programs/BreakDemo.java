package programs;

public class BreakDemo {

	public static void main(String[] args) {
		
		
		  demo: for(int i = 1;i<=3;i++) {
		  
		  
		  for(int j=1;j<=3;j++) {
		  
		  if(j==2) { continue demo; }
		  
		  System.out.println(i+ " "+j); }
		  
		  System.out.println(); }
		 
	}
}
