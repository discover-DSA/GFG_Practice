package arrays;
import java.util.*;
public class RemoveDuplicates {

	static int count=0;
	static void removeDups(int[] arr, int n)
	{
		//Using ArrayList: start
//		ArrayList<Integer> al = new ArrayList<Integer>(n);
//		for(int i=0; i<n; i++)
//		{
//			if(!al.contains(arr[i]))
//			{
//				al.add(arr[i]);
//			}
//		}
//		for(int i : al)
//		{
//			System.out.print(i+" ");
//		}
		//Using ArrayList : end
		
		//Without Arraylist: start
		
		int[] temp = new int[n];
		int t=0;
		
		for(int i=0; i<n; i++)
		{
			if(i<n-1)
			{
				if(arr[i]!=arr[i+1])
				{
					temp[t]=arr[i];
					t++;
				count++;
				}
			}
			else if(temp[t]!=arr[n-1])
			{
				//if(arr[n-1] == arr[n-2] )
				temp[t]=arr[n-1];
				count++;
				
			}
			
			
		}
		
		for(int i=0; i<count; i++)
		{
			System.out.print(temp[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		removeDups(arr, n);
	}

}
