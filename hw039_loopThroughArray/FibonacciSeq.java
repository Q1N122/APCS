/**
   Represent a Fibonacci sequence
 */
public class FibonacciSeq {

    // Create a private instance field to hold a
    // reference to an array of int values.
    private int[] seq;
    private int size;

    public FibonacciSeq(int size) {
        this.size = size;
        seq = new int[size];
    }
    /**
       Initialize this object with an array of the
       first 8 Fibonacci numbers, starting at 1.
     */
    public void gimme8() {
        if (size == 0)
            return;    
        seq[0] = 1;
        if (size == 1) 
            return;
        seq[1] = 1;
        if(size == 2)
            return;
        int index = 2;

        while (index < size) {
            seq[index] = seq[index - 1] + seq[index -2];  
            index++;
        }
    }


    /**
       @return a string representation of this instance
     */
    public String toString() {
      String result;
      result = "the sequence: ";
      int index = 0;
      while (index < size) {
          result += seq[index] + " ";
          index++;
      }
      result += "\nNumber of array entries available: " + seq.length;
      return result;
  }

}
