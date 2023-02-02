package Sorting;

public class BubbleSort 
{

	public static void main(String[] args) 
	{		
		int array[]= {64,32,25,12,22,11,90};
		int n = array.length;
		int temp;
		
		System.out.println("Original array:=======");
		for(int a: array)
		{
			System.out.print(a+" ");
		}
				
		//Sorting
		for(int i =0; i<n-1; i++)
		{
			for(int j =0;j<n-i-1; j++)
			{
				if(array[j]>array[j+1])
				{
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Sorted array:=========");
		for(int b: array)
		{
			System.out.print(b+" ");
		}
		
		

	}

}
