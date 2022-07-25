package day04_ifStatements;

public class c1_postPreConditions {

    public static void main(String[] args){

        byte x=21;

        System.out.println(x);//21
        System.out.println(--x);////20

        //post
        int w=30;//30
        System.out.println(w--);//post //30 //it will be 29 on next line
        System.out.println(w--);//post //29 //it wil be 28 on nexxt line
        System.out.println(--w);//pre  //27 //next line will stil on 27
        System.out.println(w);//27
        System.out.println(w++);//post //it will be 28 on next line
        System.out.println(w);//28\








    }



}
