/***********************************************
    Nest method invocations

    Tianlang Qin
    hw009
    worked with no one
    advised by no one

 **********************************************/

public class HelloBondified {

    public static void main( String[] commandLine) {
        System.out.println( dialog( "James", "Bond"));
        System.out.println( dialog( "Tianlang", "Qin"));
    }

/*
    method dialog
    returns the 2-person dialog for one name
*/
    private static String dialog( String firstName
                                , String lastName) {
        return introduction(firstName, lastName) + "\n" +
               greet(firstName, lastName) + "\n" +
               correction(firstName, lastName) + "\n" +
               correctGreet(firstName, lastName);
    }

/*
    method bondify
    returns a phrase in the form
        Bond, James Bond
*/
    private static String bondify( String firstName
                                 , String lastName) {
        return lastName + ", " + firstName + " " + lastName;
    }

/*
    method introduction
    returns 
        my name is [bondified name]
*/
    private static String introduction( String firstName
                                      , String lastName) {
        return "My name is " + bondify(firstName, lastName) + ". ";
    }

    /*
    method greet
    returns 
        Hello, [bondified name]. How you doon?
    */
    private static String greet( String firstName
    , String lastName) {
        return "Hello, " + bondify(firstName, lastName) + ". How you doon?";
    }

    /*
    method correction
    returns 
        Not "[bondified name]." Just "[name]"?
    */
    private static String correction( String firstName
    , String lastName) {
        return "Not \"" + bondify(firstName, lastName) + ".\" Just \"" + firstName + " " + lastName + ".\"";
    }

    /*
    method correctGreet
    returns 
        Hello, [name]. How you doon?
    */
    private static String correctGreet( String firstName
    , String lastName) {
        return "Hello, " + firstName + " " + lastName + ". How you doon?";
    }
}
