package arrays;
import java.util.*;

//working code


public class FindDuplicates {

	//static int count=0;
	public static ArrayList<Integer> duplicates(int[] arr,int n)
	{
		ArrayList<Integer> al=new ArrayList<Integer>(n);
		int t=0;
		while(t<n)
		{
			int temp=arr[t];
			for(int i=0; i<n; i++)
			{
				if(i==t)
				{
					continue;
			}
				else if(!al.contains(arr[i]) && temp==arr[i])
				{
					al.add(arr[i]);
					//count++;
					//System.out.println(count);
					
				}
				
			}
			t++;
		}
		
		return al;
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		ArrayList<Integer> Darr = new ArrayList<Integer>(n);
		Darr=duplicates(arr, n);
		
		//System.out.println(count);
		
		if(Darr.isEmpty())
		{
			System.out.println("-1");
		}
		for (int i = 0; i < Darr.size(); i++)
	           
            // Printing and display the elements in ArrayList
            System.out.print(Darr.get(i) + " ");  
		/*for(int i=0; i<count; i++)
		{
			
		}
		/*
		ArrayList<Integer> al = new ArrayList<Integer>(n);
		int i=0;
		
		al.add(arr[i]);
		return al;
		*/
		
		
		

	}

}
