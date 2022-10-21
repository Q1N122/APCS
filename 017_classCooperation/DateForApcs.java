/**
 * Tianlang Qin
 * hw017
 * worked with no one
 * helped by no one
  Represent a date
 */

/*
Hw017 needs no fields. This stub code is just for reference
on the datatypes and names we aim to use.
    short year
    byte  month_0_11
    byte  day_1_31
*/
public class DateForApcs {
    static short year;
    static byte month_0_11;
    static byte day_1_31;

    public static String iso8601(short year, byte month_0_11, byte day_1_31) {
      String result = "";
      result += String.valueOf(year);
      if (month_0_11 < 9) {
          result += "0" + String.valueOf(month_0_11 + 1);
      }
      else {
          result += String.valueOf(month_0_11 + 1);
      }
      if (day_1_31 < 10) {
          result += "0"  + String.valueOf(day_1_31);
      }
      else {
        result += String.valueOf(day_1_31);
      }
      return result;
    }

    public static boolean isLeapYear(short year) {
        if (year % 4 != 0) 
            return false;
        if (year % 100 != 0) 
            return true;
        if (year % 400 != 0)
            return false;
        return true;
    }
}
