package day10_ForLoop;

import java.util.Scanner;

public class c5_reversString {
    public static void main(String[] args) {
        //how can you reverse a string
        //input hello
        //output olleh

        String word = "Hello";
                      //01234

        String reverseWord="" + word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);
        System.out.println(reverseWord);

        Scanner input=new Scanner(System.in);



        System.out.println("Enter Your Word");
        String word2 = input.nextLine();
        //since we dont know the word we need get last index of word to be able to reverse string from last char
        //to get last index number lengt -1
        System.out.println("Length of your word " +word2.length());
        int lastIndex=word2.length()-1 ;




        String reversWord2 ="" ;

        //what is te starting point for loop
        //starting point last index
        //ending point will be 0

        for (int i =lastIndex ; i >=0 ; i--){ /// last index lastindex-1 .....0 (11 10 9 8..0)
            System.out.println(word2.charAt(i));//11
            reversWord2 += word2.charAt(i);//11
            System.out.println(reversWord2);

        }
        System.out.println(reversWord2);


        //BURAYI TEKRAR ET

























































    }
}
