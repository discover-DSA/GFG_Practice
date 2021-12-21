package arrays;
import java.util.ArrayList;
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(92);
		al.add(81);
		al.add(55);
		al.add(76);
		
		//System.out.println(al);
		
		for(int i:al)
		{
			System.out.println(i);
		}

	}

}
