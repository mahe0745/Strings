import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the first String");
	      String s = sc.next();
	      System.out.println("Enter the second String");
	      String s1 = sc.next();
	      s1= s1.replace(" ", "");
	      s=s.replace(" ","");
	      boolean b = checkAnagram(s,s1);
	      if(b)
	    	  System.out.println("It is a Anagram");
	      else
	    	  System.out.println("Not a Anagram");
	}
	public static boolean checkAnagram(String s,String s1) {
	     char[] arr = s.toCharArray();
	     char[] arr1 = s1.toCharArray();
	     Arrays.sort(arr);
	     Arrays.sort(arr1);
	     if(arr.length!=arr1.length)
	    	 return false;
	     for(int i=0;i<arr.length;i++) {
	    	 if(arr[i]!=arr1[i])
	    		 return false;
	     }
	     return true;
	 }
}
