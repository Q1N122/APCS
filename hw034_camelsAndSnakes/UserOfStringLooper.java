/**
 * Tianlang Qin
 * hw034
 * worked with no one 
 * helped by no one
 * 
  Exercise the StringLooper class
 */

public class UserOfStringLooper {
    public static void main( String[] commandLine) {
        StringLooper s0 = new StringLooper();

        // toVariablesFormat
        System.out.println( System.lineSeparator()
                          + "----- toVariablesFormat -----");
        s0.source = "A_SNAKE_CASE_STUB";
        System.out.println( s0.toVariablesFormat());
        s0.source = "HELLO_WORLD";
        System.out.println( s0.toVariablesFormat());
        s0.source = "I_LIKE_PIZZA_AND_I_DONT_LIKE_BACONS";
        System.out.println( s0.toVariablesFormat());
        s0.source = "A_B_C_D_E";
        System.out.println( s0.toVariablesFormat());



        // toConstantsFormat
        System.out.println( System.lineSeparator()
                          + "----- toConstantsFormat -----");
        s0.source = "aCamelCaseStub";
        System.out.println( s0.toConstantsFormat());
        s0.source = "helloWorld";
        System.out.println( s0.toConstantsFormat());
        s0.source = "iLikePizzaAndIDontLikeBacons";
        System.out.println( s0.toConstantsFormat());
        s0.source = "aBCDE";
        System.out.println( s0.toConstantsFormat());



        // System.out.println( System.lineSeparator()
        //                   + "----- verticalize -----");
        // s0.source = "Go!";
        // System.out.println( s0.verticalize() );
    }
}