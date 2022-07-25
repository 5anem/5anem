package day07_Scanner;

import java.util.Scanner;

public class c3_SwitchPractices {
    public static void main(String[] args) {


        //Duplicate case values are not allowed .
        //The value for a case must be of the same data type as the variable in the switch.(or samller then switch range.)
        //The value for a cast must be constant or a literal.Variable are not allowed.
        //The break statement is used inside the switch to terminate a statement sequence.
        //The break statement is optional.If omitted , execution will continue on into the next case.
        //The defult statement is optional anf ==d can appear anywhere inside the switch block.
        //In case , if it is not at the end , then a break statement must be kept after the defult statement
        //to avoid the execution of the next case statement.

        //Accepted Data Types
        //The variable passed as a switch argument can be one of the following :
        //char
        //byte
        //short
        //int
        //String
        //Integar , Short , Byte , Characther


        //create an logic that will check the number and print the day name
        byte b1 = 1;
        short s1 = 2;
        int number =4;

        long l1 = 5; //not acceptable
        float f1 = 2;// not acceptable
        double d1 = 10;// not accepted

        String dayName; //empty string not assigned anthing yet

        //The value for a case must be of the same data type as the variable in the switch
        // (or smaller then switch range)


        //The value for a case must be a constant or a literal . Variables are not alowed.
        // if you dont specify whole number type java will take as a int number
        switch (number) {

            case 1:
                dayName = "Monday";
                break;
            //case 1:     //Duplicate case values are not allowed.
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;

            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid Day";
                break;
        }
        System.out.println(dayName);

     //print case number 1-5 as weekday
        //6 and 7 is weenkend

        String dayType;
        switch (number){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Weekday";
                break;
            case 6:
            case 7:
                dayType ="Weekend";

            default:
                dayType= "Invalid DayType";


                System.out.println(dayType);

        }

        System.out.println(number + "is a " + dayName);
        System.out.println(number + "is a " + dayType);
        System.out.println(number + "is a " + dayType);

























    }



















}


