package arrays;
import java.util.Scanner;
public class ReverseArray {

	
	static void reverseArray(int[] arr, int n, int start, int end)
	{
		
		if(start==end || end<start)
			return;
		else
		{int temp;
			if(start<end)
			{
				temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
			}
			reverseArray(arr, n, start+1, end-1);	
		}
			
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start=0;
		int n=sc.nextInt(); 
		int end=n-1;
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		reverseArray(arr, n, start, end);
		int i=0;
		while(i<n)
		{
			System.out.print(arr[i] + " ");
			i++;
		}

	}

}
