package recursion;
import java.util.Scanner;

public class NthFibonacciNumber {
	
	public static  int fib(int n) {
		if(n<=1)
			return n;
		return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int res=fib(n);
		System.out.println(res);
		sc.close();

	}

}
