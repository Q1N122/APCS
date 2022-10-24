import java.sql.Date;

/**
 * Tianlang Qin
 * hw017
 * worked with no one
 * helped by no one
  Exercise the DateForApcs class
 */
 
 public class UserOfDateForApcs {
    public static void main(String[] args) {
        System.out.println(DateForApcs.iso8601((short)2022, (byte)9,(byte) 20));
        System.out.println(DateForApcs.iso8601((short)1939, (byte)8, (byte)1));
        System.out.println(DateForApcs.iso8601((short)1991, (byte)11, (byte)25));

        System.out.println(DateForApcs.isLeapYear((short) 2022)); //false
        System.out.println(DateForApcs.isLeapYear((short) 1939)); //false
        System.out.println(DateForApcs.isLeapYear((short) 1992)); //true
        System.out.println(DateForApcs.isLeapYear((short) 1900)); //false
        System.out.println(DateForApcs.isLeapYear((short) 1640)); //true
    }
    
 }
      