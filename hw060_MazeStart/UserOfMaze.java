/**
 * Tianlang Qin
 * hw060
 * worked with no one
 * helped by no one
 * 
  Test Maze class.
  
  Requires command line argument:
  o  the name of a file containing a maze.

  For example,
      java UserOfMaze mazes/4cell_treasureWest.txt
 */

public class UserOfMaze {
    public static void main(String[] commandLine)
       throws java.io.FileNotFoundException {
        System.out.println();

        Maze maze = new Maze( commandLine[0]
                            );
        System.out.println( maze + System.lineSeparator());
    }
}
