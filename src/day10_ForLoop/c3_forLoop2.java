package day10_ForLoop;

public class c3_forLoop2 {
    public static void main(String[] args) {

        //start point is 6
        //end point is -2
        //itivation is i--

        for (int i=6 ; i>-2 ; i--){
            System.out.println("berf"); // 6 5 4 3 2 1 0 -1---8 times
        }

        for (int i =0 ; i<5 ; i--){
          //  System.out.println("san");
        }//


//        //starting point 10
//        //ending point is 1
//        //iteration +1
        for (int i=10 ; i<0; i++){
            System.out.println("sanem");
        }//not correct case ; will not print




        //starting point 10
        //ending point is 1
        //iteration -1
        for (int i=10 ; i>0; i--) {//10 9 8 7 6 5 4 3 2 1 0
            System.out.println("man");//10 9 8 7 6 5 4 3 2 1
        }// 9 8 7 6 5 4 3 2 1 0

        //create an condition that will print square number from 0 10
        //square of number mean is  number+number
        //output
        //number  0
        //number1 1
        //number2 4
        //number3 9
        ///.....
        //number10 100


        //starting point is 0
        //ending point is 10
        //iteration +1



        for (int number =5 ; number <=10 ; number++){//0 1 2 3 4 10 11
            System.out.println("Number is " +number );// 0 1 2
            int squareResult=number*number;//0 1 4
            System.out.println("Square of Number " +squareResult);//0 to 10
         }
















































































    }
}
