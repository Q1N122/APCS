import javax.xml.transform.Source;

/**
 * Tianlang Qin
 * hw034
 * worked with no one 
 * helped by no one
 * 
  Loop through Strings
 */
public class StringLooper {

    public String source;

    /**
       @return a camel-case String without underscores
       when "source" is a snake-case String with underscores
     */
    public String toVariablesFormat() {
        int index = 0;
        boolean capitalize = false;
        String result = "" ;//+ source.charAt(0);

        while (index < source.length()) {
            if(source.charAt(index) == '_' ) {
                capitalize = true;
            }
            else if (capitalize) {
                result += source.charAt(index);
                capitalize = false;
            }
            else {
                result += source.substring(index, index + 1).toLowerCase();
            }
            index++;
        }
        return result;
    }


    /**
       @return an all-caps, snake-case String with underscores
       when "source" is a camel-case String
     */
    public String toConstantsFormat() {
        int index = 0;
        String result = "";

        while (index < source.length()) {
            String temp = source.substring(index, index + 1);
            if (isAllUpper(temp)) {
                result += "_" + temp.toUpperCase();
            }
            else {
                result += temp.toUpperCase();
            }
            index ++;
        }
        return result;
    
    }


    /**
       @return the boolean value of the assertion
               "s" is entirely upper case.

       Technically, the assertion is
           "s" has no non-upper case characters
       Under this definition, the "surpised" emoticon O_O
       counts as "entirely upper case"
     */
    private static boolean isAllUpper( String s) {
        return s.equals( s.toUpperCase());
    }


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

      based on https://piazza.com/class/l7z53v3xdiq1hu/post/209 with
      redundant curly braces removed
     */
    public String verticalize() {
        String accumulator = "";

        int curPos = 0;
        while (curPos < source.length())
            accumulator +=   source.substring(curPos, ++curPos)
                           + System.lineSeparator();
        return accumulator;
    }


    /**
       Test methods in this class, especially private methods
       like isAllUpper
     */
    public static void main( String[] commandLine) {
        System.out.println( System.lineSeparator()
                          + "----- test StringLooper.isAllUpper() -----");
        System.out.println( isAllUpper( "Brian Kernighan"));

        // punctuation should have no effect
        System.out.println( isAllUpper( "I SAID, BRIAN KERNIGHAN!!!"));
        System.out.println( isAllUpper( "O_O"));
    }
}
