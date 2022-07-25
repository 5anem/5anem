package Day11_whileLoop;

public class c1_ContinueStatements {
    public static void main(String[] args) {

        //
        for (int i =0 ; i <5 ; i++ ){
            System.out.println("Before Break");

            if (i==3){
                break; // when jaa erach ere it will break the loop
             //   System.out.println("After Break"); //wont rinning after break
            }

            System.out.println("After if ");

        }

        for (int i =0 ; i <5 ; i++){
            System.out.println("Before Continue" + i); // o 1 2 3 4

            if ( i==2 ){

                continue;
            }

            System.out.println("after continue "+i);//0 1 3 4

        }
        //print only even(cift sayi) numbers from 1-10
            //first way you can just look for if (i%2==0) then print i number
           // second way is you can skip the odd (tek sayi) numbers by using continue statement


        for (int i=1 ; i <=10 ; i++){

            if (i%2 !=0){ // this will be true for odd numbers
                     //wich i want to skip odd numbers and print only even numbers
                continue;//this will skip the odd number such as 1,3,5,7,9
            }
            System.out.println(i);//we print here to make sure numbers has checked by our if condition
        }

        // create a java locig that will not print numbers that are divisible both by 2 and 3 from 1 to 20
        //            anyting left sould be printed
        //            use continue statement
        // 1 2 3 4 5    ...

        //output should not include 6 ,12 and 18 because they are divisial by 2 and 3 at te same time

        System.out.println("***********************");
        // starting point is 1
        // ending point is 20


        // i <=20   i <21

        for (int i =1 ; i <21 ; i++){
            if (i %2 ==0  && i %3 ==0 ){

                // whhic we dont want them printed
                //if you want to skip them use the continue
                continue; //skip the 6 , 12 , 18
            }


            System.out.println( i + " , "); // 1,2,3,4,5,7,8,9,10 , ....

        }



















































    }

}



















































































