package day07_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class c1_ScannerClass {

    public static void main(String[] args) {

    //firs of all scanner is a library under java
     //libraries has ready methods created inside of library
     //to be able to use any librarry we nneed call them in our class
     //and create object from that librarry

        Scanner input= new Scanner(System.in) ;
     //i called scanner cass (ready librarry under java ) and created object called input
        //to be  able to create object we need to create new Scanner

        // to import library
        //click on option + enter for mac
        //click on alt +enter for windows

        System.out.println("Insert your byte number");
        byte b1= input.nextByte();
        //nextbyte method will ask user to enter a number and then it will accent that number anf assigned to b1 variable

        System.out.println("enter int number");

         //to be able to use library methods you need to call te object
        int numberInt= input.nextInt();

        System.out.println(" Number int is "+numberInt);

        Scanner scan= new Scanner(System.in);//this is another objcet comes from Scanner class
        //name of object is scan

        short numberShort= scan.nextShort();
        System.out.println(numberShort);




























































}

}
