package recursion;
import java.util.Scanner;
import java.math.*;
public class RopeCutting {
	
	public static int maxpieces(int n, int a, int b, int c)
	{
		if(n==0) return 0;
		if(n<0) return -1;
		int res1 = Math.max(maxpieces(n-a, a, b, c),
				maxpieces(n-b, a, b, c));
		int res2 = Math.max(res1, maxpieces(n-c, a, b, c));
		
		if(res2==-1)
			return -1;
		return res2+1;
		
	}


	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(maxpieces(n,a,b,c));

	}

}
