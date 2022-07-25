package day09_StringMethods;

import javax.crypto.spec.PSource;

public class c1_StringMethods {
    public static void main(String[] args) {


        //charAt()	          Returns the character at the specified index (position)	        char
        //indexOf()	          Returns the position of the first found occurrence
        //                      of specified characters in a string	                            int
        //isEmpty()	          Checks whether a string is empty or not	                        boolean
        //lastIndexOf()	      Returns the position of the last found occurrence of
        //                      specified characters in a string	                                int




        //task
        //1.you will create a scanner where you ask user how is te weater
        //2.you will need to store that in a string to check in the if statement
        //3.you will create an if else bloc where you check wheater
        //4.if weather is good you create another scanner where it ask user to put tempratuce
        //if weather is bad dont ask for tempratuce


        String sentence="Hello world , this is here Java helllo ";

        char ch=sentence.charAt(3);
        System.out.println(ch);//second l
        System.out.println(sentence.charAt(2));//first l


        //lastIndexOf()	      Returns the position of the last found occurrence of
        //  specified characters in a string	  int

        System.out.println(sentence.indexOf("l"));//2
        System.out.println(sentence.indexOf("ll"));//2
        System.out.println(sentence.indexOf("lo"));//3
        System.out.println(sentence.indexOf("lllo ") + 2);

        int indexNumber = sentence.indexOf("l") ;
        System.out.println(indexNumber);
        System.out.println(indexNumber + 2);

        //get lasr index of letter a from sentence
        int lastindexe=sentence.indexOf("");
        int lastIndexe=sentence.indexOf("e ");
        System.out.println("last e " + lastIndexe);

        //lastIndexOf()	      Returns the position of the last found occurrence of
        //                      specified characters in a string	                                int

        String sentence2="Hello world . Java is here lllo ";


        System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
        //to get the last l
        System.out.println(sentence2.lastIndexOf("l"));
        //index of first l
        int indexFirst=sentence2.indexOf("l");
        int indexLast=sentence2.lastIndexOf("l");
        int indexSecondl=sentence2.indexOf("lo");
        int indexBeforelast=sentence2.lastIndexOf("llo");

        System.out.println(indexFirst + "," +indexLast );
        System.out.println(indexSecondl + "," +indexBeforelast );





        //create a logic that will check login function of facebook,twitter,gmail.
        //correct username = renastech
        //correct password = renastech123

        //use scanner here to pass usernames and passwords
        //do validation of those usernames and password matching with correct credentials































































































    }
}
