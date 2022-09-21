/***********************************************
 * Tianlang Qin
 * hw 008
 * worked with no one 
 * helped by no one 
 * 
 *  Add a method to the previous HelloWorld
 **********************************************/

public class HelloPerson {

    public static void main(String[] commandLine) {
        System.out.println( greet( "Professor", "Kernighan"));
        System.out.println(greet("Admiral" , "Hopper"));
        System.out.println(greet("Good-time" , "Johnny von Neumann"));
    }

    private static String greet( String honorific, String lastName) {
        return "hello, " + honorific + " " + lastName + ". How you doon?";
    }
}
