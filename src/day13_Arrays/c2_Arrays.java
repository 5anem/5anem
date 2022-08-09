package day13_Arrays;

public class c2_Arrays {
    public static void main(String[] args) {

//
        //declaration of array
        //DataType [] nameofyourcontainer = {data1,data2,data3, .... }

        int[] numberLis = {10, 20, 30, 40};
        //                  0 ,1, 2, 3,

        String[] names = {"Sanem", "ian", "Fays", "Radu"};
        //        0    ,   1     ,   2  ,     3

        System.out.println(names[2]); //Fays
        System.out.println(numberLis[3]);//40


        //print all the names from staring array


        for (int i = 0; i <= 3; i++) {
            String name = names[i];
            System.out.println("Name " + i + " == " + name);

        }



        int[] numbers2 = {1, 2, 3, 4, 5, 10, 7, 8, 0};
        //                0  1  2  3  4  5   6  7  8

        //numbers2[4] == this means index number 4 from numbers 2 list will be your result
        if (numbers2[2] > numbers2[5]) { // 3>10
            System.out.println("2nd index number of number2 list is bigger then index number 5");
        }else {
            System.out.println("2nd index is not bigger to 5th index number ");
        }

        String engineer = new String();//this will only store one engineer
        String [] engineers = new String[4] ; // 0 1 2 3

        // since array size is fixes you wil need to specify the lenght when you create the array
        //size has to passed []
        //for this array you have size as a 4 (this number will be assigned at the begining )
        // all the index from engineers will be null

        System.out.println(engineers[2]);//null
        engineers[2] = "Sanem";
        System.out.println(engineers[2]);//this wont be null any more because we assigned to sanem
        engineers[0] = "Berk";
        System.out.println(engineers[0]);


        //lenght of array
        int lenght = engineers.length;//4
        System.out.println("Length of the engineers is "+lenght);

        //print the all enginners
        for (int i=0 ; i <= engineers.length -1 ; i++){
            System.out.println(engineers[1]);
        }

        boolean [] booleans =new boolean[5];//lenth is 5
        //last index 4
        System.out.println(booleans[0]);
        //if yo dont assigned anything to booleans java eill assign fals as a defult

        booleans[0] =true;

        System.out.println(booleans[0]);
        System.out.println("************************");
        boolean [] booleans1 ={true,false,true,false,false,true,true};


        //create an java code will check boolen valus
        //if value is true print passed
        //if value is false print falled

        // i <= booleans1.length -1  lastindex
        // i < booleans1.length
        //both are same

        for (int i = 0 ; i <= booleans1.length-1 ; i++){
            if (booleans1[i]){ //0
                System.out.println("Passed");
            }else {//1
                System.out.println("Failled");
            }

        }





























































































    }
        }
