package day04_ifStatements;

public class c6_minNumber {


    //3    varable
    //x=400 y=200 z=300
    //x=100 y=200 z=300
    //x=300 y=100 z=400

    //output should be minimum number is 200

    //if x is the minimum that means x<y and x<z
    //if y is the minimum that means y<x and y<z
    //if z is the minimum that means z<x and z<y


    // 3 if statement to check whic boolen is true


    public static void main(String[] args){
        int x=500;
        int y=200;
        int z=300;

        boolean xMin=x<y && x<z; // 500<200 and 500<300 //false
        boolean yMin=y<x && y<z;//true
        boolean zMin=z<y && z<x;//false


        if(xMin){
            System.out.println("Minimum number is " + x);//it wont print this one

        }




        if (yMin){
            System.out.println("Minimum number is " + y);//this will print
        }


        if (zMin){

             System.out.println("Minimum number is" + z);//it wont print this one

        }






    }
}
