package arrays;
import java.util.Scanner;
public class InsertionInArray {
	static int insertAtIndex(int[] arr, int item, int pos, int n,int cap) {
		int idx;
		if(n==cap)
		{
			System.out.println("Array is full");
			return n;
		}
		else 
			  idx = pos-1;
			for(int i=n-1; i>=pos; i--)
			{
				arr[i+1]=arr[i];
			}
			arr[idx]=item;
			
		
		return n+1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		int t=0;
		int cap=15;
		while(t<n-2)
		{
			arr[t]=sc.nextInt();
			t++;
		}
		//arr= [12,13,11,15,16];
		n = insertAtIndex(arr, 11, 2, n,  cap);
		for(int i=0; i<n;i++)
		{
		System.out.print(arr[i]+" ");
		}
	}

}
