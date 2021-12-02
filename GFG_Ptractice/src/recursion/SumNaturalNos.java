package recursion;
import java.util.Scanner;

public class SumNaturalNos {
	
	static int SumN(int n) {
		if(n==0)
			return 0;
		return n + SumN(n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(SumN(n));
		sc.close();
	}

}
