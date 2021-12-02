package recursion;
import java.util.Scanner;

public class Print1toN 
{
	static  int a=1;
	
	public static void Ntoone(int d)
	{
		if(d<=0)
		{
			return;
		}
		else
		{
		System.out.print(d + " ");
		Ntoone(d-1);
		}
	}
	
	public static void  onetoN(int d)
	{
		if(d<=0)
		{
			return;
		}
		else
		{
			onetoN(d-1);
			System.out.print(d+" ");
		}
			
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		onetoN(n);
		System.out.println();
		Ntoone(n);
		sc.close();
	}
}
