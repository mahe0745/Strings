import java.util.Arrays;
import java.util.Scanner;
public class MaximumCharacter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String ");
    String s = sc.next();
    maximum(s);
  }
  public static void maximum(String s) {
    char[] arr = s.toCharArray();
    int k = 0;
    int l = 0;
    int[] arr1 = new int[arr.length];
    char[] arr2 = new char[arr.length];
    for (int i = 0; i < arr.length; i++) {
      int count = 1;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          if (arr[j] != '0') {
            count++;
            arr[j] = '0';
          }
        }
      }
      arr2[k++] = arr[i];
      arr1[l++] = count;

    }
    int max = -1;
    int pos = 0;
    for (int i = 0; i < arr1.length; i++) {
      if (arr1[i] > max) {
        max = arr1[i];
        pos = i;
      }
    }
    Arrays.sort(arr1);
    if (arr1[arr.length - 1] == arr1[arr.length - 2]) {
      System.out.println("Some String occurs in equal number of times and their count is" + " " + arr1[arr1.length - 1]);
    } else {
      System.out.println("maximum occuring string is" + " " + arr2[pos] + " " + "the count is " + max);
    }

  }

}
