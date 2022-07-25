package day05_ifcontinue;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class c4_quiz {
    //shortcut fot the main methof --- tpe main+ enter



        public static void main(String[] args) {

        /*    String turkishone=null;
            String kurdisone=null;
            Scanner bc=new Scanner(System.in);
            System.out.print(" enter a word  ");
            turkishone = bc.nextLine();

            kurdisone = turkishone.substring(1)+turkishone.charAt(0)+"ay";
            System.out.println(kurdisone);

*/

            int number1=19;
            int number2=9;

            int max = 0; //this is the store max number
            String message = ""; // this is the message it will be printing the end the
            if (number1 > number2){//it is not going to check here
                max=number1;
            }else {//it will be true
                max=number2; } //max=number1 =19
                System.out.println(max);


            //System.out.println("Mximum number is" + max )
            message=" Maximum number is " +number1;
            System.out.println(message);
















        }
    }




