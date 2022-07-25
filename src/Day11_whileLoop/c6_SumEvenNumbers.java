package Day11_whileLoop;

public class c6_SumEvenNumbers {
    public static void main(String[] args) {

        /*
        Write a program using while loop that calculates the sum of the even numbers between 0 and 30
         */

        //startig point ending iteration


        int sum1=0;

        //for loop
        for (int i = 0 ; i<=30 ; i++){

            if (i %2 ==0 ){ //numbers are even
                System.out.println("adding this to sum1 "+ i);
                sum1 += i;

            }
        }
        System.out.println( "Sum1 is " +sum1);

        //while loop
        //starting point ending iteration

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        int start =0;
        int sum2=0;

        while (start <= 30){

            if (start %2==0){
                System.out.println("adding this number to sum2 " +start);
                sum2 +=start;
            }

            start++;

        }
        System.out.println("Sum2 is " +sum2);



























































































    }
}
