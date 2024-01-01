
public class Prac37 {

	public static void main(String[] args) {
		int n = 5;
		
		//Butterfly Pattern
			 
			//First half's star
		for(int a = 1;a<=n;a++) {
			for(int b = 1;b<=a;b++) {
				System.out.print("*");
			}
			//Space Print
			int space = 2*(n-a);
			for(int b = 1; b<=space; b++) {
				System.out.print(" ");
			}
			//Second half's star
			for(int b = 1; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println();
		
		}
					//Second Part
		
				//first half's star
			for(int a = n; a>=1;a--) {
				for(int b = 1; b<=a; b++) {
					System.out.print("*"); 
				}
				//Space print
				int space = 2*(n-a);
				for(int b = 1; b<=space; b++) {
					System.out.print(" ");
				}
				//Second half's star
				for(int b = 1; b<=a; b++) {
					System.out.print("*");
				}
				System.out.println();
		}
			
	}
	
}
