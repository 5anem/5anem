package Day3_variableContinue;

public class c6_assigment {

    public static void main(String[] args){

        //create te different 3number
        //second number should be = firs number +7
        //third number should be = second number+8
        //ex : x=26 y=32 z=40
        //ex : x=30 y=37 z=45




        int x= 33;
        int y = x+7;
        int z= y+8;

        //print x y z
        System.out.println("X is : " + x);
        System.out.println("Y is : " + y);
        System.out.println("Z is : " + z);


        //sum 3 numbers
        System.out.println("X,Y,Z is:" +(x+y+z)) ;

        //if the x divisible by 2,3,5
        // 3.chech if x is divisible by 2,3,5 (check for each number)
        // if it is divisible print : x is divisible by 2 true
        // if it is not divisible prnt : x is divisible by 2 false.


        //System.out.println("20 is divisible by 2 True:" );// neeed to do define number to condition


        boolean divisibleBy2forx= x%2==0;      //if reminder equel 0 that means number will devided by 2  without reminder
                                                // whic makes the number divisible by 2

        boolean divisibleBy3forx= x% 3 ==0;

        System.out.println(x + " is divisible by 2" +divisibleBy2forx);
        System.out.println(x + " is divisible by 3" +divisibleBy3forx);

    }

}


