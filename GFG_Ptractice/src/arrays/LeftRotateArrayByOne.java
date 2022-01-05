package arrays;
import java.util.*;
public class LeftRotateArrayByOne {


	static void LRO(int[] arr, int n)
	{
		int temp=arr[0];
		for(int i=0; i<n-1; i++)
		{
			if(i<n-1)
				arr[i] = arr[i+1];
			
			//
		}
		arr[n-1]=temp;
		printArray(arr, n);
	}
	
	static void printArray(int[] arr,int n)
	{
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		LRO(arr, n);

	}

}
