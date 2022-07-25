package day08_String;

import java.util.Scanner;

public class c1_scannerPractices {
    public static void main(String[] args) {

//to be able to use library we will need to crerate an object from class

        Scanner input = new Scanner(System.in);

        System.out.println("Employee First Name" );
        String firstName = input.next() ; //next will only accept one word
        System.out.println("full name is" + firstName);


        //to handle enter that comes after next use below line
        input.nextInt();



        System.out.println( " Full name of Emplyo "  );
        String fullName=input.nextLine(); //will accept enter
        System.out.println("full name is " +fullName);









































    }
}
