
public class Prac37 {

	public static void main(String[] args) {
		int n = 5;
		for(int a = 1;a<=n;a++) {
			for(int b = 1;b<=a;b++) {
				System.out.print("*");
			}
					//Space Print
			int space = 2*(n-a);
			for(int b = 1; b<=space; b++) {
				System.out.print(" ");
			}
			for(int b = 1; b<=a; b++) {
				System.out.print("*");  //Star print
			}
			System.out.println();
		
		}
					//Second Part
			for(int a = n; a>=1;a--) {
				for(int b = 1; b<=a; b++) {
					System.out.print("*"); //first star print
				}
				int space = 2*(n-a);
				for(int b = 1; b<=space; b++) {
					System.out.print(" ");
				}
				for(int b = 1; b<=a; b++) {
					System.out.print("*");
				}
				System.out.println(
);
			}
			
				
	
	}
}


