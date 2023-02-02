import java.util.Arrays;
import java.util.Scanner;

public class UniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to check");
		String s = sc.next();
		s=s.replace(" ", "");
        unique(s);
	}
    public static void unique(String s) {
    	char[] arr = s.toCharArray();
    	boolean b=true;
    	Arrays.sort(arr);
    	int j=0;
    	for(int i=0;i<arr.length-1;i++) {
    		j=i+1;
    		if(arr[i]==arr[j]) {
    			b = false;
    		}
    		if(!b) {
    			System.out.println("Duplicates occured");
    			break;
    		}
    	}
    	if(b)
    		System.out.println(s+" "+"String contains unique characters");
    }
}
