package day09_StringMethods;

public class c5_StringMethods4 {
    public static void main(String[] args) {

        /*
        toLowerCase()	      Converts a string to lower case letters	                        String
        toUpperCase()	      Converts a string to upper case letters	                        String
        trim()	              Removes whitespace from both ends of a string	                    String

         */

        String fullName="Sanem Korkmaz";
                       //012345678

        System.out.println(fullName.toLowerCase());//sanem korkmaz
        System.out.println(fullName.toUpperCase());//SANEM KORKMAZ

        String fullName2="sanem korkMAZ";
        //print me intials are capital : Sanem Korkmaz
        String firstName=fullName2.substring(0,1).toUpperCase().concat(fullName2.substring(1,5+1).toLowerCase());//I + others.lowercase
        System.out.println(firstName);
        String lastName=fullName2.substring(5,6).toUpperCase().concat(fullName2.substring(6).toLowerCase());
        System.out.println(lastName);

        String mewFullName2=firstName.concat(" ").concat(lastName);
        System.out.println(mewFullName2);




/*
        System.out.println(firstName);
        String lastName=fullName2.substring(8,9).toUpperCase().concat(fullName2.substring(9).toLowerCase());
        System.out.println(lastName);

        String newFullName2=firstName.concat(" ").concat(lastName);
        System.out.println(newFullName2);


 */

        //    trim()	   Removes whitespace from both ends of a string	     String

        String str= "    hello     java     planet   ";
        System.out.println(str.replace(" " , ""));

























































































    }
}
