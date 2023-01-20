/**
  Solve a maze.
 */
public class MazeSolver {

    /**
      Construct an instance, using the default constructor,
      which does nothing.
     */


    /**
      @return a MazeWithExplorer object that represents the path to the treasure.
      May modify "candidate".
     */
    public MazeWithExplorer findPath( MazeWithExplorer candidate) {

        // base cases
        if( candidate.status() == candidate.STATUS_PATH_EXISTS) 
            return candidate;

        else if ( candidate.status() == candidate.STATUS_NO_PATH_THRU_HERE)
            return null;  

        // recursive case: status is STATUS_MAYBE_PATH_THRU_HERE
        else return candidate;  // stub; to be replaced in next assignment
    }
}
