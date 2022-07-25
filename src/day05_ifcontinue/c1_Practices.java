package day05_ifcontinue;

public class c1_Practices {

          //32.Write a Java program t compare two numbers.Go to the editor
    //input Data:
    //input first integar:25
    //input second integar:39
    //Expected Output:
    //
    //25 != 39
    //25 <  39
    //25 <= 39


    //if statement wil be very useful if you have preconditions to print your code

    public static void main(String[] args) {

        int number1=25;
        int number2=30;

        //==
        //!=
        //<=
        //>=
        //<
        //>






if(number1==number2){ // if number are not equal print below println
    System.out.println(number1 + "==" + number2 ); //false

}



    if(number1!=number2){ // if number are not equal print below println
        System.out.println(number1 + "!=" + number2 ); //false

    }


    if(number1<=number2){
        System.out.println(number1 + "<=" + number2 ); //false

    }



    if(number1>=number2){
        System.out.println(number1 + ">=" + number2 ); //false

    }


    if(number1<number2){
        System.out.println(number1 + "<" + number2 ); //false

    }




    if(number1>number2){
        System.out.println(number1 + ">" + number2 ); //false

    }

    int i1=20;
    int i2=-i1 +i1 - ++i1;//-20 + 20 -21=-21  // i2=-21

    System.out.println(i2);

    if (i2 < 0){// i2=-21 //true
        System.out.println( i2  +  " is negative ");
    }

    if (i2>0){ // i2=-21 //false // java will not printed
        System.out.println(i2 + " is positive ");

        }

     }

}
