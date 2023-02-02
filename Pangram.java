
import java.util.Scanner;
public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String s =sc.nextLine();
		s = s.toUpperCase().replace(" ", "");
		checkPanagram(s);
	}
	public static void checkPanagram(String s) {
		char[] arr = s.toCharArray();
		int[] a = new int[26];
		int r=65;
		boolean b1= true;
		for(int i=0;i<arr.length;i++) {
		    int b = arr[i];
			int ans = b-r;
			a[ans]++;
		}
		for(int i:a) {
			if(i==0) {
				b1=false;
				System.out.println("Not a Panagram");
				break;
			}
		}
		if(b1) {
			System.out.println("It's a panagram");
		}
		
	} 

}
