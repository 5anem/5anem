package day12_doWhileLoop;

public class c2_ReverseString {
    public static void main(String[] args) {
        String actualText = "Java is so fun !!";
        System.out.println(actualText);


        String reverse ="";
        int lastindex=actualText.length() -1; //last index of our text which is our first index for reverse string

        do {
            //our goals is store each letter from last one to first one

            reverse += actualText.charAt(lastindex);

            //iteration
            //from last index to first index
            lastindex--;

        }while (lastindex >=0); // condition which is   your end point which is index 0 (first letter)
        System.out.println(reverse);

         //your class is orange that means you didnt add to git
        //if it is green you add it to git  but you didnt commit it
       //blue measn you commit it but you made changes after commit





























































































    }
}
