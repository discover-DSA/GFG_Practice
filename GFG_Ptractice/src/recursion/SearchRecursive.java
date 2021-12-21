package recursion;

public class SearchRecursive {
	
	static boolean search(int[] arr, int x,int i ) {
		if(arr.length<=0) {
			return false;}
		if(arr[i]==x) {
			return true;
		}
		else 
			
		return search( arr,  x, i+1);
			
		}
		
	

	public static void main(String[] args) {
		int n = 5;
		int[] arr = {1,2,3,4,5};
		System.out.println(search(arr,9,0));
		
		

	}

}
