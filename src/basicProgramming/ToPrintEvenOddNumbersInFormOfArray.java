package basicProgramming;

import java.util.ArrayList;

public class ToPrintEvenOddNumbersInFormOfArray {

	public static void main(String[] args) {
int a[] = {1, 2, 3, 4, 5, 6};
        
        // Create two ArrayLists to store even and odd numbers
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        
        // Iterate through the array to extract even and odd numbers
        for(int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0) {
                evenNumbers.add(a[i]); // Add even number to evenNumbers list
            } else {
                oddNumbers.add(a[i]); // Add odd number to oddNumbers list
            }
        }
        
        // Print the extracted even and odd numbers
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);

	}

}
