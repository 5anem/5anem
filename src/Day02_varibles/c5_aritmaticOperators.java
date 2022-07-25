package Day02_varibles;

public class c5_aritmaticOperators {

    public static void main(String[] args){

        //    float      4 bytes           Stores fractional numbers.Sufficient for storing 6 to 7 decimal digits
        //    double     8 bytes           Stores fractional numbers.Sufficient for storing 15 decimal digits

        double doubled1=5.5;
        System.out.println(doubled1);
        double d2=5.55555555;
        System.out.println(d2);

        // As a defult java picks double for decimal number
        System.out.println(2.5);

        float f1=2.5f; //java will take decimel number as a double thats why you need tell compiler this is an float number
        System.out.println(f1);


        System.out.println("******");
        System.out.println(2+5);//it will sum te number
        System.out.println("2+5");// it will print the text as it is.


        int i1=3;
        int i2=5;
        //sum of 2 numbers
        System.out.println(i1 + i2);

        double number1=2.5;
        double number2=3.5;
        System.out.println(number1+number2);//6.0


        //minus operator
        System.out.println(i1-i2);//-2
        System.out.println(number1-number2);//-1.0
        System.out.println(number1-i1);//-0.5

        //multiple operator
        System.out.println(i1*i2);//15
        System.out.println(number1*number2);//8.75

        //division
        System.out.println(i2/i1);//5/3
        System.out.println(5/3);// 2 numbers are int here results will be also int   1
        System.out.println(5/3.0);//since we use number or double result also eill be double   1.66666666666667

        System.out.println(10/2);//5
        System.out.println(10.0/2);//5.0

        //reminder
        System.out.println(10 % 5);// reminder demek bolme isleminde kalan kisma deniyor. anlami 10/5=2 kalan 0 reminder=0  //0
        System.out.println(10%3);//10/3=2 kalan 1 //reminder=1
        System.out.println(10.0%3);//1.0



    }

}
