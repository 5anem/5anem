package day12_doWhileLoop;

public class c4_NestedLoop {
    public static void main(String[] args) {

        //NESTEDD IF :: IF INSIDE ANOTHER ID
        //NESTED LOOP : LOOP INSIDE ANOTHET LOOP

        //ex:
        //while inside for loop
        //for loop inside for loop
        //do while inside for
        // .....  any loop can be inside of any loop

        for (int i =0 ; i< 3 ; i++) { ///  0 1 2
            System.out.println("Hello ");
            //i=0  , 1  .2

            for (int j = 1; j < 5; j++) { // 01 02 03 04  ,, 11 12 13 14 , 21 22 23 24 ,,31 32 33 34 , 41 42 43 44
                System.out.println("Java  ");
            }
        }



        for (int i = 1 ; i <4 ; i++) { // 1 2 3
            System.out.println("1.For Start ");

            for (int k = 3; k < 6; k++) {
                System.out.println("2.For " + "i is : " + i + "k is " + k);
            }
            System.out.println("1.For End ");
        }

        //i = 1
              //k == 3 4 5
        //i=2
              //k == 3 4 5
        //i = 3
        //k== 3 4 5

        //print me following
        //3 row 5 column
        //* * * * *
        //* * * * *
        //* * * * *


        for (int i= 1 ; i <= 3; i++){
            System.out.println("* * * * * ");
        }
        System.out.println("*************************");
        int totalRow=3;
        int totalColumn= 5;

        for (int i=1 ;i<=totalRow ; i++){//1 2 .. totalRow

            for (int j=1; j<= totalColumn ; j++){ //  1 2 ... totalColumn
                System.out.print("* ");

            }
            System.out.println();// to move on next line
        }
        //int i =1
        //j == 1 2 3 4 5
        //* * * * *
        //println

        //int i=2
        //j == 1 2 3 4 5
        //* * * * *

        //int i=3
        //j == 1 2 3 4 5
        //* * * * *

        //...

        System.out.println("---------------------");

        for (int i=1 ;i<=totalRow ; i++){ // i =1

            //i==1 ... totalrow
            int j=1;
            while (j <= totalColumn){// j 1 2 .. totalcomun
                System.out.print("* ");
                j++;
            }
            System.out.println();

        }



































































































    }
}
