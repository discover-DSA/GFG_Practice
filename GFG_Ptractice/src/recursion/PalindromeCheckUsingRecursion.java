package recursion;
import java.util.Scanner;
public class PalindromeCheckUsingRecursion {

	static boolean palindromeCheck(String s, int start, int end) {
		if(s.length()<=0)
			return true;
		if(start>=end)
			return true;
		 
		return(s.charAt(start)==s.charAt(end)) && palindromeCheck(s, start+1, end-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(palindromeCheck(s, 0, s.length()-1));
		
		sc.close();
	}

}
