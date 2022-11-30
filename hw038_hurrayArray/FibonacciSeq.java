/**
 * Tianlang Qin
 * hw038
 * worked with no one 
 * advised by no one 
   Represent a Fibonacci sequence
 */
public class FibonacciSeq {

    // Create a private instance field to eventually
    // hold a reference to an array of int values.
    // your code here
    private int[] fibNums;


    /**
       Initialize this object with an array of the
       first 8 Fibonacci numbers, starting at 1.
     */
    public void gimme8() {
        fibNums = new int[8];
        fibNums[0] = 1;
        fibNums[1] = 1;
        int index = 2;

        fibNums[2] = fibNums[1] + fibNums[0];
        fibNums[3] = fibNums[2] + fibNums[1];
        fibNums[4] = fibNums[3] + fibNums[2];
        fibNums[5] = fibNums[4] + fibNums[3];
        fibNums[6] = fibNums[5] + fibNums[4];
        fibNums[7] = fibNums[6] + fibNums[5];

        // // push one too many
        // fibNums[2] = fibNums[1] + fibNums[0];
        // fibNums[3] = fibNums[2] + fibNums[1];
        // fibNums[4] = fibNums[3] + fibNums[2];
        // fibNums[5] = fibNums[4] + fibNums[3];
        // fibNums[6] = fibNums[5] + fibNums[4];
        // fibNums[7] = fibNums[6] + fibNums[5];
        // fibNums[8] = fibNums[7] + fibNums[6];

        // //nttstt
        // while (index < fibNums.length) {
        //     fibNums[index] = fibNums[index - 1] + fibNums[index -2];  
        //     index++;
        // }

        
        
    }


    /**
       @return a string representation of this instance
     */
    public String toString() {
        String result;
        result = "the sequence: ";
        int index = 0;
        while (index < fibNums.length) {
            result += fibNums[index] + " ";
            index++;
        }
        result += "\nNumber of array entries available: " + fibNums.length;
        return result;
    }

}
