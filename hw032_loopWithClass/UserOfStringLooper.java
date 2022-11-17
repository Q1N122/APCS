/**
 * Tianlang Qin 
 * hw032
 * worked with no one 
 * helped by no one
  Exercise the StringLooper class
 */

public class UserOfStringLooper {
    public static void main( String[] commandLine) {
        System.out.println( System.lineSeparator()
                          + "----- demo toUpperCase -----");
        StringLooper s0 = new StringLooper();
        s0.source = "Makes me wanna shout!";

        System.out.println( s0.toUpperCase());

        System.out.println();

        System.out.println( s0.verticalize());
    }

}