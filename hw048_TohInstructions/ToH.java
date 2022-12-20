import java.lang.annotation.Target;

/**
 * Tianlang Qin
 * hw048
 * worked with no one
 * helped by no one
   Represent a solution to the Towers of Hanoi puzzle
 */
public class ToH {

private int nDisks;
private String from_saysRequestingEntity
             , to_saysRequestingEntity
             , spare_saysRequestingEntity
             ;
private Move[] moves;
private int nMoves;  // # of moves calculated so far.
  /* Usefully, this is the offset into "moves" of the next
     slot to be populated
  */


    /**
      Construct an instance
     */
    public ToH( int nDisks
              , String from
              , String to
              , String spare
              ) {
        this.nDisks = nDisks;
        from_saysRequestingEntity = from;
        to_saysRequestingEntity = to;
        spare_saysRequestingEntity = spare;
        
        moves = new Move[(int)Math.pow(2, nDisks) - 1];
        // create an empty array of "moves
    }


    /**
       @return a string representation of this instance
     */
    public String toString() {
        String result;
        result =   "To move " + nDisks + " disks"
                 + " from " + from_saysRequestingEntity
                 + " to " + to_saysRequestingEntity
                 + " using " + spare_saysRequestingEntity
                 + " if necessary:" + System.lineSeparator()
                 ;
             // report the "moves", using Move.toString()
             for (Move i : moves) {
                result += i;
             }
        return result;
    }


    /**
       Populate "moves" for the given problem.
     */
    public /* instance */ void generateAllMoves() {
        System.out.println( "Toh.generateAllMoves() stub");
        generateMoves( nDisks
                     , from_saysRequestingEntity
                     , to_saysRequestingEntity
                     , spare_saysRequestingEntity
                     );
    }


    /**
       Recursively add to "moves" for a particular point
       in the problem, as specified in the parameters.
     */
    private /* instance */ void generateMoves( int nDisks
                                             , String from
                                             , String to
                                             , String spare
                                            ) {
        if (nDisks == 1) {
            int i = 0;
            while (moves[i] != null) {
                i++;
            }
            moves[i] = new Move(from, to);
            return;
        }
        else {
            generateMoves(nDisks - 1, from, spare, to);
            int i = 0;
            while (moves[i] != null) {
                i++;
            }
            moves[i] = new Move(from, to);
            generateMoves(nDisks - 1, spare, to, from);
            return;
        }
    }

}