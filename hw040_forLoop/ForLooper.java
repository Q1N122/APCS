/**
 * Tianlang Qin
 * hw040
 * worked with no one 
 * helped by no one 
   Hold methods illustrating looping using FOR

   Contrary to good Javafication, this class is not a user-defined
   datatype. Rather, for pedagogic convenience, it is just a collection
   of methods aimed at learning to write FOR loops.
 */
public class ForLooper {

    /**
       stringify
       @return a string representation of "me",
               starting with "label",
               including the count of elements, followed by
               elements surrounded by vertical bars (|)
     */
    public static String stringify (
        // stub for a declaration of "me" as a reference to an array of Strings
        String[] commandLine
      , String label
      ) {
        String result =   label
                        + " has "
                        + commandLine.length
                        +" elements: ";

        for (int i = 0; i < commandLine.length; i++) {
            result += "|" + commandLine[i] + "|, ";
        }
        
        return result;
    }


    /**
       sumNnios
       @return the sum of the smallest "numToSum"
               Non-Negative Odd Integers (nnios)
     */
    public static int sumNnios( int numToSum) {
        int accum = 0;
        
        for (int i = 0; i < numToSum; i++) {
            accum += i * 2 + 1;
        }
        
        return accum;
    }
}
