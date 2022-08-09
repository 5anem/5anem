package day14_Arrays;

public class practices2 {
    public static void main(String[] args) {



        int [] numbers={24,25,30,60,77,44};

        int maxnumbers= numbers[1];

        for (int i =0 ; i<numbers.length; i++){

            if(numbers[i]>maxnumbers){

                maxnumbers=numbers[i];
            }




        }System.out.println("maxnumbers = " + maxnumbers);



















    }




}
