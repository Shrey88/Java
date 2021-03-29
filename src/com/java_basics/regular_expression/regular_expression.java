package com.java_basics.regular_expression;

/*
 * some methods in the string class use the expression as parameter
 * for example matches method, replace method, split method all actually works with
 * regular expressions
 *
 * so the regular expression are often used to search, validate the user input matches
 * a specific pattern
 *
 * for e.g. we may want email address to be verified provided by the user against a regular expression
 * should look
 */
public class regular_expression {
    public static void main(String[] args) {
        /*
         * simple example of regular expression is string literal
         */
        System.out.println("Example of regular expression....");
        String string  = "I am a string. Yes, I am.";
        System.out.println(string);
        String yourString  = string.replaceAll("I", "You");
        System.out.println(yourString);
        System.out.println();

        /*
         * we can actually do much more with the character classes and boundary matches
         * it represents a set or class of character classes like wild class
         * and boundary matcher looks for the boundaries such as the beginning and and end
         * of string or word.
         */
        String alphanumeric = "abcDeeeFGhhiiiiiijkl99z";
        System.out.println("Original alphanumeric String : " + alphanumeric);
        // so dot(.) is the wild character for any character matcher.
        System.out.println("Replace All Method using dot as wild character");
        System.out.println(alphanumeric.replaceAll(".", "Y"));
        System.out.println();

        // carrot(^) we use it to match the beginning of the string
        // if there is any second occurrence of the string then that will not be replaced
        System.out.println("Replace all method using the carrot sign to match the starting characters");
        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));
        System.out.println();

        /*
         *  boundary matches
         *  it accepts the regular expression and returns true if the string matches
         *  and returns false if the string does not match.
         */
        System.out.println("Matches method.....");
        System.out.println(alphanumeric.matches("^hello"));
        System.out.println();

        /*
         *  this returns false because it tries to the match the complete string and
         *  not just come characters of the string.
         */
        System.out.println("Matches method....");
        System.out.println(alphanumeric.matches("^abdDeee"));
        System.out.println();

        /*
         *  This will return true with or without carrot(^) sign.
         */
        System.out.println("Matches method....");
        System.out.println(alphanumeric.matches("^abcDeeeFGhhiiiiiijkl99z"));
        System.out.println();


        /*
         *  replacing the end of the character using the boundary matching
         */
        System.out.println(alphanumeric.replaceAll("ijkl99z$", "THE END"));


        /*
         * replacing the characters provided in the square brackets with the new character/String .
         */
        System.out.println(alphanumeric.replaceAll("[aei]", "X"));


        /*
         * replacing the characters provided in the square brackets only if they are
         * followed by the other characters mentioned in the next square brackets
         */
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));


        /*
         *  replace all the characters except e and j
         *  carrot sign negates the given pattern in the square brackets
         *  if you want to use the carrot sign as the starting poistion of the string
         *  then it should be mentioned outside of the square brackets.
         */
        String newalphanumeric = "abcDeeeFGhhiiiiiijkl99z";
        System.out.println(newalphanumeric.replaceAll("[^ej]", "X"));


        /*
         *  find the range of characters or numbers in the string and
         *  replacing them with string or character.
         *
         *  it is case sensitive search, so in the below case it will replace only the lower case
         *  characters a, b, c, d, e, f with X
         */
        System.out.println(newalphanumeric.replaceAll("[a-f3-8]", "X"));


        /*
         *  you can also mention the range of upper case letters with the lower case letters
         */
        System.out.println(newalphanumeric.replaceAll("[a-fA-F3-8]", "X"));


        /*
         *  irrelevant of the upper case or lower case letters, you want to replace the matching characters
         *
         *  i is used for the ascii characters
         *  u is used for the unicode characters.
         */
        System.out.println(newalphanumeric.replaceAll("(?i)[a-f3-8]", "X"));


        /*
         *  to replace any digit in string
         *      1 : use the range of digits i.e. 0-9
         *
         *      2 : \\d to replace any digit
         *
         *      3 : \\D to replace the non - digit
         */
        System.out.println(newalphanumeric.replaceAll("[0-9]", "X"));
        System.out.println(newalphanumeric.replaceAll("\\d", "X"));
        System.out.println(newalphanumeric.replaceAll("\\D", "X"));


        /*
         *  to remove the whitespace
         */
        String hasWhitespace = "I have blanks and\ta tab, and also a newline\n";
        System.out.println(hasWhitespace);
        System.out.println(hasWhitespace.replaceAll("\\s", ""));


        /*
         *  for non-space character
         *  so all we can see on the scree is tab, spaces and newline characters
         *  non-space characters are hard to see.
         */
        System.out.println("Non-space character : " + hasWhitespace.replaceAll("\\S", ""));


        /*
         *  non white space character
         */
        System.out.println("Non White space character : " + newalphanumeric.replaceAll("\\w", "X") );

        /*
         *  white space characters are not replaced
         */
        System.out.println("White space characters are not replaced : " + hasWhitespace.replaceAll("\\w", "X"));
    }
}


