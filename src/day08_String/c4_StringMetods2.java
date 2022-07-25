package day08_String;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class c4_StringMetods2 {
    public static void main(String[] args) {

        //equals()	          Compares two strings. Returns true if the strings are equal,
        //                      and false if not	                                                boolean
        //equalsIgnoreCase()	  Compares two strings, ignoring case considerations	            boolean

        String world1="Hello";
        String world2="Hello";//this will be under pool memory
        String world3=new String("Hello");//this will be under heap memory
        String world4=new String("Hello");

        System.out.println(world1.equals(world2));//true
        System.out.println(world1.equals(world3));//false
        System.out.println(world2.equals(world3));//false
        System.out.println(world3.equals(world4));//true

        //equals method will only care exact match
        //it wont check how variables created
        //== operator  will aslo check how variable created


        System.out.println("*********************");
        System.out.println(world1 == world2);//true
        System.out.println(world1 == world3);//false
        System.out.println(world2 == world3);//false
        System.out.println(world3 == world4);//false


        //equalsIgnoreCase()	  Compares two strings, ignoring case considerations	            boolean

        String str1="Java";
        String str2="java";
        String str3="JAvA";

        System.out.println("**********");

        System.out.println(str1.equals(str3));//false because not exact matc  equals care how variable memory
        System.out.println(str1.equalsIgnoreCase(str2));//truer
        System.out.println(str1.equalsIgnoreCase(str3));//true because it will not care it always care the mean

        boolean b1=str1.equalsIgnoreCase(str3);//true
        boolean b2=str1.equals(str2);//false
        boolean b3=str3.equalsIgnoreCase(str1);//true

        if (b1){//true java will check inside this if condition
            System.out.println("b1 is true");//this lin will be excuted
            if (b2){
                System.out.println("b2 is true");//false since if vond. java wont check inside this if
                if (b3){
                    System.out.println("b3 is true");

                }else{
                    System.out.println("b3 is false");
                }


            }else {
                System.out.println("b2 is false");
            }


        }else{
            System.out.println("b1 is false");
        }




















































    }
}
