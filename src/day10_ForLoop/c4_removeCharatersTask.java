package day10_ForLoop;

import java.util.Scanner;

public class c4_removeCharatersTask {
    public static void main(String[] args) {
        //Task : Create a java program that will check given string and
        //    if string starts or ends with 'a' or 'A' remove it from string.
        //    if it is not leave it as it is :
        //    examples :
        //    if string is Hello  output should be Hello
        //    if string is JavA  output should be jav
        //    if string is Ajavaa  output should be jav
        //    .....
        //    Hint : Try with different cases to make sure your code is working correctly .
        //    if you want to try with multiple words to you can create scanner and try multiple times with different words


        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Word : ");
        String word = input.nextLine();

        int lenght=word.length();//0 1 2 3
        System.out.println("Lenght of plain word is " +lenght);



        //first  lest cehck first letter
        //if letter is small or capital a remove it
        if (word.substring(0,1).equalsIgnoreCase("a")){

            word = word.substring(1);
            System.out.println("Word after first if check " +word);

        }


        lenght=word.length();
        System.out.println("Lenght of word after first if check " +lenght);

        //to share last index number
        int lastIndex=lenght-1;

        if (word.substring(lastIndex).equalsIgnoreCase("A")){

             word= word.substring(0,lastIndex);
        }
        System.out.println("Modified word " +word);















































































    }
}
