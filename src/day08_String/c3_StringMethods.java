package day08_String;

import groovy.json.JsonToken;

public class c3_StringMethods {

    public static void main(String[] args) {


        /*

Method	              Description                                                     	Return Type
charAt()	          Returns the character at the specified index (position)	        char
concat()	          Appends a string to the end of another string	                    String
contains()	          Checks whether a string contains a sequence of characters	        boolean
endsWith()	          Checks whether a string ends with the specified character(s)	    boolean
equals()	          Compares two strings. Returns true if the strings are equal,
                      and false if not	                                                boolean
equalsIgnoreCase()	  Compares two strings, ignoring case considerations	            boolean
indexOf()	          Returns the position of the first found occurrence
                      of specified characters in a string	                            int
isEmpty()	          Checks whether a string is empty or not	                        boolean
lastIndexOf()	      Returns the position of the last found occurrence of
                      specified characters in a string	                                int
length()	          Returns the length of a specified string	                        int
replace()	          Searches a string for a specified value, and returns
                      a new string where the specified values are replaced	            String
replaceFirst()	      Replaces the first occurrence of a substring that matches the
                      given regular expression with the given replacement	            String

startsWith()	      Checks whether a string starts with specified characters	        boolean
substring()	          Extracts the characters from a string,
                      beginning at a specified start position,
                      and through the specified number of character	                    String
toLowerCase()	      Converts a string to lower case letters	                        String
toUpperCase()	      Converts a string to upper case letters	                        String
trim()	              Removes whitespace from both ends of a string	                    String

     */
       // charAt() Returns the character at the specified index (position) char
        //charAt method will ask you to pass index number (position number)

        String str= "Hello";
                    //01234
        //index numbers always start from 0 in java

        char letter0=str.charAt(0);
        System.out.println(letter0);
        System.out.println(str.charAt(4));


        String word="hello world";
                   //0123456789
        System.out.println("word 5 is " + word.charAt(5));



        //concat() ( birlestirmek )	  Appends a string to the end of another string	    String


        String  firstName="Sanem";
        String  lastName="KORKMAZ";

        System.out.println(firstName  +  "  "  +  lastName);
        System.out.println(firstName.concat(lastName));
        System.out.println(firstName.concat( " " +lastName ));
        System.out.println(firstName.concat(" ").concat(lastName));


        String fullName= firstName.concat( " ").concat(lastName);
        System.out.println(fullName);

        System.out.println("****");
        System.out.println(fullName.concat( " " + str ).concat( " " +letter0) );

        //System.out.println(fullName.concat(letter0));
        //concat method will ony accept string
        //i cant concat other than string
        System.out.println(fullName.concat( " " + letter0));


        int score = 98;
        System.out.println(fullName.concat(" ").concat("" + score));

        //sanem korkmaz score is 99
        System.out.println(firstName.concat( " " ).concat(lastName).concat(" ").concat("score is : ").concat(""+score));

        //contains()  Checks whether a string contains a sequence of characters	   boolean

        //contains will check if the string contains given value
        //if string contains it will return true
        //if string doesnt  contains it will return false

        String sentence = "Java dsd killk2342@";
        System.out.println(sentence.contains("a"));
        System.out.println(sentence.contains("A"));
        System.out.println(sentence.contains("Ja"));
        System.out.println(sentence.contains("Ja "));//false because  no ja(space) inside the sentence
        System.out.println(sentence.contains("va"));

           boolean example=sentence.contains(" ");
        System.out.println(example);
        System.out.println("**********************");


       // endsWith()   Checks whether a string ends with the specified character(s)	    boolean

        //if string contains it will return true
        //if string doesnt  contains it will return false

        String sentence2="Hello Java 45";
        System.out.println(sentence2.endsWith("5"));
        System.out.println(sentence2.endsWith("45"));
        System.out.println(sentence2.endsWith(" 45"));
        System.out.println(sentence2.endsWith("Java 45"));
        System.out.println(sentence2.endsWith("JavA 5"));//FASLE
        System.out.println(sentence2.endsWith("Java 4"));//FASLE





























































    }
}
