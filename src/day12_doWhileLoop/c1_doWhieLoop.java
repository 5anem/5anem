package day12_doWhileLoop;

public class c1_doWhieLoop {
    public static void main(String[] args) {

        //to open excisiting different project in the intellie
        //file open recent or
        //file open
        //in windows - c - user- hp  - ideaprojects


        //for loop
        //while loop
        //it will run as long as your condition is true
        //it will stop running when your condition turns to false
        //do while loop
        //it will run once at the begininng no mather your while condition is true or false
        //it will continue to run if while is true

        int number = 10;

        while (number <10){
            System.out.println("While loop"); // since condition is false it wont print anything from insdie while
        }

        do {
            System.out.println("do while loop"); //do will run at least one time no mather condition is true or false
        }while (number <10);



        //infinitive do while
       // do {
        //    System.out.println("hello");
       // }while (number ==10) ;


        int number2=2 ;

        do {
            System.out.println("Number 2 is : " +number2);
            number2++ ;
        }while (number2 < 10); //3 ...9


        do {
            System.out.println(number2);//2
            number2--;//1
        }while (number2<0);// false condition

        //printing even number from 0-100



        int number4 = 0;//starting point

        do {
            if (number4 % 2 == 0) {
                System.out.println(number4 + " , ");
            }
                number4++; //iteration

        }while (number4<100); //condition end result point






























































































    }
}
