import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to check");
		String s = sc.next();
		s=s.toLowerCase();
        palindrome(s);
	}
	public static void palindrome(String s) {
	   char[] arr = s.toCharArray();
	   int j=arr.length-1;
	   boolean b = true;
	   for(int i=0;i<arr.length;i++) {
		   if(arr[i]!=arr[j]) {
			   b= false;
			   break;
		   }
		   j--;
	   }
	   if(b)
		   System.out.println(s+" "+"is a palindrome");
	   else
		   System.out.println(s+" "+"is not a palindrome");
	}

}
