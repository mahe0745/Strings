import java.util.Scanner;

public class StringRemove {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to remove duplicate");
		String s = sc.next();
        	System.out.println(removeDuplicates(s));
	}
	public static String removeDuplicates(String s) {
		  char[] arr = s.toCharArray();
		  for(int i=0;i<arr.length;i++) {
			  for(int j=i+1;j<arr.length;j++) {
				  if(arr[i]==arr[j]) {
					  arr[j]='0';
				  }
			  }
		  }
		  String s1="";
		  for(char c:arr) {
			  if(c!='0') {
				  s1=s1+Character.valueOf(c).toString();
			  }
		  }
		  return s1;
	}

}
