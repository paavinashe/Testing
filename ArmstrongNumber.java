package basicProgramming;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int num = 153;
		int sum = 0;
		int org_num = num;
		
		while(num != 0) 
		{
			int digit = num%10;
			sum += digit * digit * digit;
			num = num/10;
		}
		if(sum == org_num) 
		{
			System.out.println(org_num + " is armstrong number");
		}
		else 
		{
			System.out.println(org_num + " is not armstrong number");
		}

	}

}
