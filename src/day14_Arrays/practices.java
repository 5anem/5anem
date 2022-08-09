package day14_Arrays;

import java.util.Arrays;

public class practices {
    public static void main(String[] args) {




        //task3
//write a program that can return the largest string of text from an array
//ex         String[] names = {"hello", "world", "java", "pyton", "sevgin", "renastechschool"};
//output :renastechschool
//write a program that can return the shortest string of text from an array
////ex         String[] names = {"hello", "world", "java", "pyton", "JS" "sevgin", "renastechschool"};
//output : JS

        String[] names = {"hello", "world", "java", "pyton", "sevgin", "renastechschool", "JS"};
        //                   0       1        2        3         4            5             6

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        //in assci table
        //A 65      a  97
        //Z 90      z  122

        //lets assume first word has max length
        //lets assume first word has min length

        int maxLength=names[0].length();  //5
        int minLength= names[0].length(); //5

        //lets assume largest and shorttest string
        String longestName= names[0]; //hello
        String shortestName= names[0]; //hello


        for (int i =0 ; i < names.length ; i++){

            if (names[i].length() >= maxLength){
                maxLength= names[i].length();
                longestName = names[i];
            }

            if (names[i].length() <= minLength){
                minLength = names[i].length();
                shortestName = names[i];
            }
        }

        System.out.println(longestName);
        System.out.println(shortestName);



        String lenghtx = "renastechschool";
        int x=lenghtx.length();
        System.out.println("x = " + x);




        int [] FindMax={10,20,30,40,50,60};

        int maxNumber= FindMax[0];
        int maxxi=0;

        for(int i=0; i< FindMax.length; i ++   ) {
            maxNumber= FindMax.length;
            maxxi=FindMax[i];
        }
        System.out.println("maxxi = " + maxxi);




    }
}
