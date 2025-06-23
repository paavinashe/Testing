package arrays;

public class TwoDimensoinal {

	public static void main(String[] args) {
		//int a[][]= new int[5][3];
		int a[][]= {{10,20,25},{20,30,35},{30,40,45},{40,50,55},{50,60,65}};
		for(int i[]:a) 
		{
			for(int j:i) 
			{
				System.out.print(j +  " ");
			}
			System.out.println();
		}

	}

}
