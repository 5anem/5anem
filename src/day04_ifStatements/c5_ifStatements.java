package day04_ifStatements;

public class c5_ifStatements {

    public static void main(String[] args){





        boolean bool1= 10>5 ; //true
        boolean b2= 10==12 ; //false

        if (2>2) { // opening bracket for if

            //if if condition is false java will not check inside if statements
            System.out.println("hello");
            System.out.println("hello");
            System.out.println("hello");
        }

        System.out.println("Java");

        if (1==1){  //true
        // if if statement is true java will go inside of if statement and wxcute the code

            System.out.println("World");
            System.out.println("World");
            System.out.println("World");
        } //closing brackets for if


        if (b2){

            System.out.println(b2);//this wont be printed

        }


        if (true){//if is true java will excue inside if statement
            //inside if
            System.out.println("b2 is " + b2);//b2 is false

        }











    }//closing brackets for main
}//closing brackets for the class

