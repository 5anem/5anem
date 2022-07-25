package day08_String;

// import java.lang.String; you dont need to import because java will import automaticly

public class c2_StringClass {

    public static void main(String[] args) {


        //to create a string
        String str="Hello";

    /*
    in Java , string is an object that represents a saquance of characters.
    The java.lang.String  class is used to create a string object.

    Hoe to create a string object  ?
    There are teo ways to create String object :

    1-By string lieral
    2-By new keyword

    create a string object By string lieral :

    java.lang.String is created by using double quotes , For Example :

     String str="Hello";
     Each time you create a string literal , the JVM checks the 'string conant pool' first.
         if the string already exists in the pool , a reference to the pooled instance is returned.
         if the string doesnt exist in the pool,  a new string instance is created and placed in the pool.

     */
        // for example
        String str1= "Hello"; //1.By string literal java will check pool and since we dont have "Hello"
        // in the pool memory java will create

        String str2  = "Hello"; //1.By string literal this wont create a new instance under pool memory
        //because if string already excist in the pool , a reference to pooled instance will be returned.

        //to reason of java use string literal logic is to make java memory more efficint



        //2.By New Keyword
        String str3= new String("Hello");
        //it will create an object called Hello under java heap memory  ( non - pool )


        System.out.println(str1==str2); // true
        System.out.println(str1==str3); //false
        //we have 2 different object and those 2 object creaed under different memory


        //wat is the different of  ==  and equals




        String s1="New York"; //placed under string pool
        s1= "Virginia"; //new object will be placed as virginia
        //s1 references will chance to virgina


        //in java string objects are immutable(degistirilemez)

        String s2= "New York";





















































































    }



}
