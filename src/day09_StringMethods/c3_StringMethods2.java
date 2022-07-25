package day09_StringMethods;

public class c3_StringMethods2 {
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



       // isEmpty()	     Checks whether a string is empty or not        boolean

        String word="azmac";
        System.out.println(word.isEmpty()); //false
        String word2="";

        boolean b1=word2.isEmpty();

        String word3=" ";
        boolean b2=word3.isEmpty();

        System.out.println(b1);//true
        System.out.println(b2);//false spcace as indac in string so string is not empty

        //    length()	     Returns the length of a specified string	     int

        String name="sanem";
                    //01234

        System.out.println("name lenght is :" + name.length()); //5

       //  to get last index number
        int lastIndex=name.lastIndexOf("m");
        System.out.println("last index of name :"+ lastIndex); //4

        System.out.println(name.charAt(4)); //m
      // System.out.println(name.charAt(5));// error / exception out of index

        // to get last index number
        int lastIndex2=name.length()-1;
        System.out.println(lastIndex2);

























































    }
}
