/**
 * Tianlang Qin
 * hw055
 * worked with no one
 * advised by no one
   Exercise the PhoneBook class, to be invoked like
       java UserOfPhoneBook "Costello, Lou"
 */
public class UserOfPhoneBook {
    public static void main( String[] commandLine) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.findPage("Kernighan, Brian"); // expecting 6;

        // PhoneBook test
        System.out.println( 
            System.lineSeparator()
          + "----- PhoneBook test -----" + System.lineSeparator()
          + "results of invoking a stub of your PhoneBook method on "
          + commandLine[0]
          );
    }
}
