package day07_Scanner;

import java.util.Scanner;

public class c2_AcannerPractices {
    public static void main(String[] args) {

        Scanner userInput=new Scanner(System.in);
        //Scanner is ready with object calls userInput


        //you can cal any method from scanner by useing the object (userInput)

        //
        System.out.println(" Insert Firt Number ");

       // int number1=25 ;
        int number1=userInput.nextInt();// we as user to enter number from console

        System.out.println("You have inserted number "+ number1);

        //check if input is even or odd


        if (number1 % 2 ==0 ){
            System.out.println(number1 + "is even number");
        }else{
            System.out.println(number1 + "is odd number");
        }

     //max and min number
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter first number");
        short num1=scanner.nextShort();
        System.out.println("Enter second number");
        int num2=scanner.nextInt();
        System.out.println("Enter third number");
        int num3=scanner.nextInt();


        //    range:
        //    double > float > long > int > short > byte
        int maxNumber=(num1 > num2 && num1>num3) ?  num1 :  (num2>num3 && num2>num1)  ?  num2 : num3;
        System.out.println( " max number is " + maxNumber);


















































    }
}
