package arrays;
import java.util.*;
public class MoveZerosToEnd {
	static void zerosToEnd(int[] arr, int n)
	{
		for(int i=0; i<n; i++)
		{
			if(arr[i]==0)
			{
				for(int j=i+1; j<n; j++)
				{
					if(arr[j]!=0)
					{
						arr[i]=arr[j];
						arr[j]=0;
					}
				}
			}
		}
		
		printArray(arr, n);
	}

	

	static void printArray(int[] arr,int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		zerosToEnd(arr, n);
				

	}

}
