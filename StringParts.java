/**
  use two String methods
 */

public class StringParts {
    public static void main(String[] commandLine) {
        String sand = "bar";
        // indexes:    012  pro tip: labeling strings' indexes saves errors

        int size;
        size = sand.length();
        System.out.print( size);
        System.out.println( " ...expecting 3");

        System.out.println( sand.substring(0,2)  + " ...expecting ba");
        System.out.println( sand.substring(0,3)  + " ...expecting bar");
        System.out.println( /*sand.substring(0,4) + */  " ...expecting error");
        System.out.println( sand.substring(1,2)  + " ...expecting ar");
        System.out.println( sand.substring(1,1)  + " ...expecting empty string");
        System.out.println( sand.substring(1)    + " ...expecting ar");
        System.out.println( /* sand.substring(1,7) +*/ " ...expecting error");
        System.out.println( /* sand.substring(7) +*/  " ...expecting error");
        
        // The substring method can be applied to any String expression.
        System.out.println(
            //01234567890123456789012345678901234567890
             "a literal representation of a string".substring(10, 13)
           + " ...expecting rep");
        System.out.println(
            //01234567890123     456789012345678901234567890
            ("an expression " + "that produces a string").substring(7)
          + " ...expecting ession that produces a string");
        System.out.println(
           //01234567890123456789012345678901234567890
            "...including substring".substring(8).substring(2, 7)
          + " ...expecting ng su");

    }
}
