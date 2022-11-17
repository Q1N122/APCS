/**
 * Tianlang Qin 
 * hw032
 * worked with no one 
 * helped by no one
  Loop through Strings
 */
public class StringLooper {

    public String source;
    
    /**
      @return an imitation of Java's String.toUpperCase()
     */
    public String toUpperCase() {
        String accumulator = "";
                
        int curPos = 0;
        while( curPos < source.length())
            accumulator += source.substring( curPos, ++curPos).toUpperCase();

        return accumulator;
    }

    /**
      @return a version of a string that prints vertically,
              by introducing the value returned by
              System.lineSeparator() between each character.
     */
    public String verticalize() {
        int index = 0; 
        String result = "";
        while(index < source.length()) {
            result += source.substring(index, ++index) + System.lineSeparator();
        }
        return result.substring(0, result.length() - 1);
    }

}