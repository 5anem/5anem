package day10_ForLoop;

public class c6_breakstatement {
    public static void main(String[] args) {

        //start point 1
        //ending point 10
        ///itivation is 1


        for (int i =1 ; i <=10 ; i++){//1 2 3 4 5
            System.out.println("java");//1 2 3 4 5 6 7 8 9 10

            if (i==4){ //4
                System.out.println("java2"); //4
            }
        }

        System.out.println("******************************************************************");

        // break statement
        //anytime java will reac to break statmntt it will stop current condition that you have
        //if java catch break inside the loop
        //loop will be stoped from running
        //anything after break statement wont be excuted

        for (int i=1 ; i <=8 ; i++){// 1 2 3 4 5
            System.out.println("hello");// 1 2 3

            if (i==7){ //3

                System.out.println("Stop Hello"); // 3
                break;//loop will be stoped by running here
                //anything after here wont be excuted for loop

            }

            System.out.println("hello again");//1 2

        }



















































    }
}
