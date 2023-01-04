/**
 * Tianlang Qin 
   hw052
   worked with no one 
   helped by no one
   Represent a solution to the Towers of Hanoi puzzle
   with a zero-disk base case.
   
 */
public class ToH {


    /**
       @return the number of moves required to move the disks
               for the given problem
     */

    /*
     * the two methods have the same name but different parameters, so when invoking countMoves, the complier checks the 
     * argument that is passed in as a parameter to know which method to use
     * this is called method overloading.
     */

    public /* instance */ int countMoves() { // this is an instance method because it needs to count the number of moves of a certain 
                                             // ToH puzzle, which is represented by an object. 
        return countMoves( nDisks);
    }

    /**
       @return the number of moves required to move
               "nDisks" disks between two towers, calculated
               recursively
     */
    private static int countMoves( // this is a class method because it only needs one parameter to run and doesn't need the object.
        int nDisks  // parameter, not the instance field
      ) {
        if( nDisks == 0)
            return 0;
        else return
            // # of moves to park nDisks -1 smaller disks out of the way
              countMoves( nDisks-1)

            + 1  // # of moves to move the biggest disk to the target tower
            
            + // # of moves to un-park nDisks -1 onto the target tower
              countMoves( nDisks-1)
            ;
            /* Since the first and last addends are the same, a little
               algebra would speed this method, at the price of clarity.
            */
        }


private int nDisks;
private String source_saysRequestingEntity
             , target_saysRequestingEntity
             , spare_saysRequestingEntity
             ;
private Move[] moves;
private int nMoves;  // # of moves calculated so far.
  /* Usefully, this is the offset into "moves" of the next
     slot to be populated
  */

private static final int MAX_MOVES = 65536;

    /**
      Construct an instance
     */
    public ToH( int nDisks
              , String source
              , String target
              , String spare
              ) {
        this.nDisks = nDisks;
        source_saysRequestingEntity = source;
        target_saysRequestingEntity = target;
        spare_saysRequestingEntity = spare;

        // create an empty array of "moves"
        moves = new Move[countMoves()];
    }


    /**
       @return a string representation of this instance
     */
    public String toString() {
        String result;
        result =   countMoves() + " moves are required"
                 + " to move " + nDisks + " disks"
                 + " from " + source_saysRequestingEntity.stripTrailing()
                 + " to " + target_saysRequestingEntity.stripTrailing()
                 + " using " + spare_saysRequestingEntity.stripTrailing()
                 + " if necessary:" + System.lineSeparator()
                 ;
             // report the "moves", using Move.toString()
             for( int offset = 0; offset <  nMoves; ++offset)
                 result +=   moves[ offset]
                           + System.lineSeparator();
        return result;
    }


    /**
       Populate "moves" for the given problem.
     */
    public /* instance */ void generateMoves() {
        generateMoves_recursiveAbstraction( 
            nDisks
          , source_saysRequestingEntity
          , target_saysRequestingEntity
          , spare_saysRequestingEntity
          );
    }


    /**
       Recursively add to "moves" to accomplish a particular
       sub-task in the problem, as specified in the parameters.
     */
    private /* instance */ void generateMoves_recursiveAbstraction(
        int nDisks
      , String source
      , String target
      , String spare
      ) {
        if( nDisks != 0){  // base case requires no movesw
            // Generate moves to park the nDisks -1 smaller disks out of the way
            generateMoves_recursiveAbstraction( nDisks-1, source, spare, target);
            
            moves[ nMoves++] = new Move( source, target);
            
            // Generate moves to un-park the smaller nDisks-1 disks onto the
            // largest disk that was to be moved.
            generateMoves_recursiveAbstraction( nDisks-1, spare, target, source);
        }
    }
}