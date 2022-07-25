package day09_StringMethods;

public class c4_StringMethods4 {
    public static void main(String[] args) {
               /*

Method	              Description                                                     	Return Type

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


        String word= "Hello world 123 helo wolrd 123";
        // replace()	          Searches a string for a specified value, and returns
        //                        a  new string where the specified values are replaced	       String


        //remove all a from word and pass x as a replacement
        System.out.println(word.replace("e", "x"));
        System.out.println(word);

        //remove all world from sentence and replace with planet
        System.out.println(word.replace("world", "planet"));
        System.out.println(word);//since we didnt reassigned this wont change

        word=word.replace("o", "");
        System.out.println(word);


       /* replaceFirst()	      Replaces the first occurrence of a substring that matches the
                                    given regular expression with the given replacement	            String
        */

        String str="Java is here , plane is Java , Java is planet";

        //replacefirst will only replace first matching one
        String newStr=str.replaceFirst("Java" ,"Phyton");
        System.out.println(newStr);

        //replace will replace all this the matching ones
        System.out.println(str.replace("Java","Phyton"));

        System.out.println(str.replace("is Java","Pyhton"));



        // startsWith()	     Checks whether a string starts with specified characters	        boolean
        // endsWith()        Checks whether a string ends with specified characters(s)	     boolean
        // if your string ends with given conition it will be true
        //if it is not then you will have false
        System.out.println("************");

        String sentence = "Java Hello Java 123 World ";

       //check if sentence either startwith or endswith java
        boolean b1 = sentence.startsWith("Java ") || sentence.endsWith("Java");
        //check if sentence startwith and endwith java
        boolean b2=sentence.startsWith("Java") && sentence.endsWith("Java");

        if (b1){
            System.out.println("Sentence either starting or ending with Java");
            if (b2){
                System.out.println("Sentence start or end with Java");
            }else{
                System.out.println("Sentence b1 is true one of them starts with Java ");
            }
        }else {
            System.out.println("Sentence doesnt start or end with Java");
        }


        System.out.println("********************************");


        //substring()	          Extracts the characters from a string,
        //                      beginning at a specified start position,
        //                      and through the specified number of character	                    String

        //we have 2 method
        //first substring(beginiing index , ending index) :
        //this will print starting given index until the ending index (excluded ending index)
        //second substring(beginiing index) : this will start printing from given index to end of the sentence

        String letters="Hello world java";
                        ///012345678910
        //print world java
        System.out.println(letters.substring(6));
        //print world
        System.out.println(letters.substring(6,10));//last index wont be included
        System.out.println(letters.substring(6,10+1));//world
        //print hello
        System.out.println(letters.substring(0,4+1));

        // lets say you hae a long sentence and if you dont want to count
        int indexOfJava=letters.indexOf("j");
        System.out.println(indexOfJava);//12
        System.out.println(letters.substring(indexOfJava));



















































    }
}
