package basicProgramming;

public class FabonacciSeries {

	public static void main(String[] args) {
		
int a = 0, b = 1;
        
        System.out.print(a + " " + b + " ");
        
        for (int i = 0; i < 8; i++) {  // Print 8 more Fibonacci numbers
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
		}

	}

}
