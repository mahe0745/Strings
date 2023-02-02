import java.util.Scanner;
public class DuplicatesPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to Print duplicate");
		String s = sc.next();
		s = s.toLowerCase();
        duplicates(s);
	}
	public static void duplicates(String s) {
		 char[] arr = s.toCharArray();
		 String s1 ="";
		 for(int i=0;i<arr.length;i++) {
			  for(int j=i+1;j<arr.length;j++) {
				  if(arr[i]==arr[j]) {
	                 if(!(s1.contains(Character.valueOf(arr[j]).toString()))) {
	                	 s1=s1+arr[j];
	                              }
				  }
			  }
		  }
		 System.out.println("The Duplicate String is"+" ");
		 for(int i=0;i<s1.length();i++) {
			 System.out.println(s1.charAt(i)+" ");
		 }
		
	}

}
