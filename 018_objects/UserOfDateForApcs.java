import java.sql.Date;
import java.util.zip.CheckedInputStream;

/**
 * Tianlang Qin
 * hw018
 * worked with no one
 * helped by no one
  Exercise the DateForApcs class
 */
 
 public class UserOfDateForApcs {
    public static void main(String[] args) {

        DateForApcs Christmas_2022 = new DateForApcs();
        Christmas_2022.year = 2022;
        Christmas_2022.month_0_11 = 11;
        Christmas_2022.day_1_31 = 25;
        System.out.println(Christmas_2022.isEarlyJuly());

        DateForApcs Easter_2023 = new DateForApcs();
        Easter_2023.year = 2023;
        Easter_2023.month_0_11 = 3;
        Easter_2023.day_1_31 = 9;
        System.out.println(Easter_2023.isEarlyJuly());
       


        /* 
        System.out.println(DateForApcs.iso8601((short)2022, (byte)9,(byte) 20));
        System.out.println(DateForApcs.iso8601((short)1939, (byte)8, (byte)1));
        System.out.println(DateForApcs.iso8601((short)1991, (byte)11, (byte)25));

        System.out.println(DateForApcs.isLeapYear((short) 2022));
        System.out.println(DateForApcs.isLeapYear((short) 1939));
        System.out.println(DateForApcs.isLeapYear((short) 1992));
        System.out.println(DateForApcs.isLeapYear((short) 1900));
        System.out.println(DateForApcs.isLeapYear((short) 1640));
        */
    }
    
 }
      