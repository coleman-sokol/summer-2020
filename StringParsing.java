public class StringParsing {

    /* takes String argument and returns that string as an integer number,
    assuming all input is correct and contains only digits and possibly
    a leading minus sign */
    public static int toInt(String str) {

        // declarations
        int index = 0;
        int length = str.length();
        int result = 0;
        boolean negative = false;

        // checks if number is negative
        if (str.charAt(0) == '-') {
            index++;
            negative = true;
        }

        /* converting numeric characters to their integer values and adding the
        appropriate values to the total */
        while (index < length) {
            result *= 10;
            result += str.charAt(index) - '0';
            index++; //could have been in above line, but this is more readable
        }

        // makes the number negative
        if (negative) {
            result = -result;
        }

        return result;
    }
    
    /* takes String argument and returns a boolean, true if the string contains
    any numeric character, returning false otherwise */
    public static boolean containsInt(String str) {
        
        // declaration
        int length = str.length();
        
        /* iterates through each character in the string, checking if it's numeric
        if so, it returns true, as the string contains at least
        one numeric character. otherwise, it continues on */
        for(int i = 0; i < length; i++) {
            if(Character.isDigit(str.charAt(i))){
                return true;
            }
        }
        
        /* if the loop completes, the string must contain no numeric characters,
        and thus returns false */
        return false;
        
    }
}
