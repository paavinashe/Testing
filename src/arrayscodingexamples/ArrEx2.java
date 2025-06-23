package arrayscodingexamples;

public class ArrEx2 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int sum = 0;
		/*for(int i=0;i<=a.length;i++) 
		{
			System.out.println(i);
			sum = sum+i;
			
		}
		System.out.println(sum);*/
		for(int i:a) 
		{
			System.out.println(i);
			sum = sum+i;
		}
		System.out.println(sum); 
		

	}

}
