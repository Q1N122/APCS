/**
 * Tianlang Qin 
 * hw031
 * worked with no one 
 * helped by no one
 * 
 Loop through the characters in a string, introducing
 line separators
 */

public class Verticalize {
    
    /**
      First cut, expecting
          V
          e
          r
          t
          i
          c
          a
          l
          i
          z
          e

          m
          e
          !
     */
    public static String verticalizeString(String input) {
        int index = 0; 
        String result = "";
        while(index < input.length()) {
            result += input.substring(index,index + 1) + "\n";
            index++;
        }
        return result;
    }

    public static void main( String[] commandLine) {
        String input = "Verticalize me!";

        System.out.println(verticalizeString(input));
    }

}
