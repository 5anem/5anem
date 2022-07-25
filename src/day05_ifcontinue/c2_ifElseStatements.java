package day05_ifcontinue;

public class c2_ifElseStatements {

     //2 numbers
    //please create a java program to cehck if this 2 number equal or not
    //if it is  print : number are equL
    //if is not print : number are no equal

    public static void main(String[] args) {
        int number1=25;
        int number2=35;

        if (number1 != number2){ //true // it will printed
            System.out.println(number1 + " is not equal " + number2 );

        }

        if (number1==number2){

            System.out.println(number1 + " is equal " + number2 );
        }

        if (number1==number2){

            System.out.println(number1 + " is equal " + number2 );
        } else {  // this else will present what ever left from first condition //mevcut ilk koşuldan geriye ne kaldıysa
            System.out.println(number1 + " is not equal " + number2 );
        }



         //even numbers--- if is number can be divided by 2 ( if reminder is 0) then we call this number even number
        //odd numbers ------if is number can be divided by 2 (if reminer is not0)this will be add number


        //please create a ava program that will check ; "if" number is even or add number.
        //if it is odd number print number is odd number .
        //if it is even  print :number is even number .

        // 20 is even number
        //25 is odd


        int number=21;

        if (number % 2 ==0) {

            System.out.println( number +  "  is even number  " );//it will pprint this one

        } else {//this else bock will get exucte are not true//dogru olmayan blogu cikaracak.
            System.out.println(number+ " is odd number");
        }





















    }



}
