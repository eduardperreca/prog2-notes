import java.util.Scanner;

public class Palindome {
   public static void main(String[] args) {
      try (Scanner s = new Scanner(System.in)) {
         String str = s.nextLine();
         System.out.println(checkPalindome(str));
      }
   }

   /*
    * Check if a given word is palindrome or not.
    * 
    * @required even empty string or whitespaces seems to be palindrome, we could
    * skip this check assuming the empty string as palindrome.
    * 
    * @param s Given String to check
    * 
    * @return true if the string is palindrome otherwise false.
    */

   public static boolean checkPalindome(String s) {
      char[] arrayChar = s.toCharArray();
      boolean flag = true;
      for (int i = 0; i < arrayChar.length - 1; i++) {
         int j = arrayChar.length - 1 - i;
         if (arrayChar[i] != arrayChar[j]) {
            flag = false;
            return flag;
         }
      }
      return flag;
   }
}
