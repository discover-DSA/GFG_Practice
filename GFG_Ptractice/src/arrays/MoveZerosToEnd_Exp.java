package arrays;
import java.util.*;

public class MoveZerosToEnd_Exp {

	static void zerosToEnd(int[] arr, int n)
	{
		int count=0;
		for(int i=0; i<n; i++)
		{
			
					if(arr[i]>0)
					{
						arr[count]=arr[i];
						arr[i]=0;
						count++;
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
