import java.util.Scanner;
public class CountCharacters {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
	    s = s.toLowerCase().replace(" ", "");
		String a ="aeiuo";
		Implementation i = new Implementation();
		i.checkConsonants(s,a);
		i.checkSpecialCharacters(s);
		i.checkVowels(s,a);
		}
	}
class Implementation{
	public void checkVowels(String s, String a) {
		String s1="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' & s.charAt(i)<='z') {
				if(a.indexOf(s.charAt(i))!=-1) {
				   if(!(s1.contains((Character.valueOf(s.charAt(i))).toString()))){
					   s1= s1+s.charAt(i);
				   }
				}
			}
		}
		System.out.println("vowels in a String is"+" "+s1+" "+"and their Count is"+" "+s1.length());
	}
	
	public void checkConsonants(String s,String a) {
		String s1="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' & s.charAt(i)<='z') {
				if(a.indexOf(s.charAt(i))==-1) 
					if(!(s1.contains((Character.valueOf(s.charAt(i))).toString())))
						   s1= s1+s.charAt(i);
			 }
			}
		System.out.println("Consonants in a String is"+" "+s1+" "+"and their Count is"+" "+s1.length());
	}
	public void checkSpecialCharacters(String s) {
	    String s1="";
		for(int i=0;i<s.length();i++) {
	    	if(!(s.charAt(i)>='a' & s.charAt(i)<='z'))
	    			if(!(s.charAt(i)>='0' &s.charAt(i)<='9'))
	    				if(!(s1.contains((Character.valueOf(s.charAt(i))).toString())))
	 					   s1= s1+s.charAt(i);
		}
		System.out.println("Special characters in a String is"+" "+s1+" "+"and their Count is"+" "+s1.length());
	}
}
