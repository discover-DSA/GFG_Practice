package arrays;
import java.util.*;

public class LeadersInArray {
	
	static void leaders(int[] arr, int n)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(arr[i]>arr[j] && !al.contains(arr[i]))
				{
					al.add(arr[i]);
				}
			}
		}
		
		for(int i:al)
		{
			System.out.print(i);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		leaders(arr, n);
	}

}
