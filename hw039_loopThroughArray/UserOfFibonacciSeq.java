/**
   Exercise the FibonacciSeq class
 */
public class UserOfFibonacciSeq {
    public static void main( String[] commandLine) {

        // first 8 Fibonacci numbers, starting a at 1
        FibonacciSeq thruF8 = new FibonacciSeq(8);
        thruF8.gimme8();
        System.out.println(
                    System.lineSeparator()
                  + "----- first 8 Fibonacci numbers -----"
                  + System.lineSeparator()
                  + thruF8
                  );

        // first 13 Fibonacci numbers, starting a at 1
        FibonacciSeq thruF13 = new FibonacciSeq(13);
        thruF13.gimme8();
        System.out.println(
                    System.lineSeparator()
                  + "----- first 13 Fibonacci numbers -----"
                  + System.lineSeparator()
                  + thruF13
                  );
        
        // first 40 Fibonacci numbers, starting a at 1
        FibonacciSeq thruF40 = new FibonacciSeq(40);
        thruF40.gimme8();
        System.out.println(
                    System.lineSeparator()
                  + "----- first 40 Fibonacci numbers -----"
                  + System.lineSeparator()
                  + thruF40
                  );
        
        FibonacciSeq thruF1 = new FibonacciSeq(1);
        thruF1.gimme8();
        System.out.println(
                    System.lineSeparator()
                  + "----- first 1 Fibonacci numbers -----"
                  + System.lineSeparator()
                  + thruF1
                  );

        FibonacciSeq thruF2 = new FibonacciSeq(2);
        thruF2.gimme8();
        System.out.println(
                    System.lineSeparator()
                  + "----- first 2 Fibonacci numbers -----"
                  + System.lineSeparator()
                  + thruF2
                  );

        FibonacciSeq thruF0 = new FibonacciSeq(0);
        thruF0.gimme8();
        System.out.println(
                    System.lineSeparator()
                  + "----- first 2 Fibonacci numbers -----"
                  + System.lineSeparator()
                  + thruF0
                  );

        
    }
}
