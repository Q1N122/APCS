/**
 * Tianlang Qin
 * hw056
 * worked with no one
 * advised by no one
 * 
   Exercise the PhoneBook class

   Tests:
   java UserOfPhoneBook "Kernighan, Brian" # expecting 000-000-0000
   java UserOfPhoneBook Archimedes         # expecting 314-159-2653
   java UserOfPhoneBook Bach               # expecting null
 */
public class UserOfPhoneBook {
    public static void main( String[] commandLine) {

        PhoneBook phoneBook = new PhoneBook();

        // PnoneBook test
        System.out.println( 
            System.lineSeparator()
          + "----- PhoneBook test -----" + System.lineSeparator()
          + "name: " + commandLine[0]
          + "   phone number: "
          + phoneBook.getPhone( commandLine[0])
          );
    }
}
