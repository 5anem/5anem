package Day11_whileLoop;

import java.util.Scanner;

public class c5_sumOfNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");

        int number = input.nextInt(); // this will read what user enter

        ///ex if input is 5 ;
        ///output will br 1+2+3+4+5 ==15

        int start = 0;
        ///you have to print sum result

        int sum=0 ;

        while (start <=number){ // 0 1 2 3 4 5 6
            System.out.println("Sum is in the while loop " +sum);
            sum +=start;
            System.out.println("Sum is after += sign" +sum);
            start++ ;

        }

        System.out.println(" Sum is at the end "+sum);






















































































    }
}
