package Day02_varibles;


  /*

         THERE ARE EIGHT PRIMITIVE DATA TYPSE IN JAVA

      DATA TYPE    SIZE              DESCRIPTION

        byte       1 byte            Stores whole numbers from - 128 to 127
        short      2 bytes           Stores whole numbers from - 32, 768 to 32, 767
        int        4 bytes           Stores whole numbers from - 2, 147, 483, 648 to 2, 147, 483, 647
        long       8 bytes           Stores whole numbers from - 9, 223, 372, 036, 854, 775, 808 to 9, 223, 372, 036, 854, 775, 807



        float      4 bytes           Stores fractional numbers.Sufficient for storing 6 to 7 decimal digits
        double     8 bytes           Stores fractional numbers.Sufficient for storing 15 decimal digits


        boolean    1 bit             Stores true or false values
        char       2 bytes           Stores a single character / letter or ASCII values

        Primitive data types : byte , short , int , long , float , double ,boolean , char   .

           for number: byte , short, int , long , float , double


           whole number: byte , short , int , long

           decimal number : float,  double

           range:
           double > float > long > int > short > byte


           larger one cannot be assigned to smaller
           smaler one can be assigned large one


           As a defult java picks double for decimal number
           As a defult java picks int for whole number


           Non primitive types : String , Object
           There are also referrence types that wrap the primitive types
           There can be useful if you need make a variable nul or use it in a class that requires a non-primitive types


           Non primitives are usually objects that we create (the exception being String)


                     for number: byte , short, int , long , float , double

                     whole number: byte , short , int , long

                     range:
                     double > float > long > int > short > byte

    */

public class c4_variables {

    public static void main(String[] args){


/*

                 for number: byte , short, int , long , float , double

                 whole number: byte , short , int , long

                 range:
                 double > float > long > int > short > byte

 */


              //   byte  1 byte  Stores whole numbers from - 128 to 127


              byte number1=25;
              System.out.println(number1);

                 //byte number2=128; this will give you error because its out of range
                //byte b1=2.5; this will also give ou error because its decimel number

              byte number2=-100;
              System.out.println(number2);



               //short      2 bytes      Stores whole numbers from - 32, 768 to 32, 767

             short s1=128;
             short s2=20000;
             // short s3=40000; //out of the range
             short s4=20;  //it covers also byte range

             System.out.println("*********");
             System.out.println(s1);
             System.out.println(s2);
             System.out.println(s4);

             //  int  4 bytes  Stores whole numbers from - 2, 147, 483, 648 to 2, 147, 483, 647
              int i1=3123123;
              System.out.println(i1);

              System.out.println(s2);
              System.out.println("35");//this is text
              System.out.println(35);//this is actual number
        // As a defult java picks int for whole number


        //long   8 bytes   Stores whole numbers from - 9, 223, 372, 036, 854, 775, 808 to 9, 223, 372, 036, 854, 775, 807
        long l1=200;
        long l2=1231231231; // when you move out int range compiler needs to know what is this number
        //that is why we pass L at the end to tell java is Long number

        System.out.println(l1);
        System.out.println(l2);


    }


}






