package day05_ifcontinue;

public class c3_MultiifStatement {

    //you will prefer muti if statenebt if you have more then 2 conditions

    public static void main(String[] args) {

        //check 2 numbers
        //first check if they equal
        //second chheck is one of them bigger
        //last condition os smaller

        int x=25;
        int y=35;

        if(x==y){
            System.out.println(x+" equal to " + y);
        }else if(x>y){
            System.out.println(x +"is bigger then" + y);
        }else{//if both of if is not true then it will print this else
            System.out.println(x+"is smaller then" + y);
        }

        //else will cover what ever left fromif and if eles conditions
        //it wil be very at the end



         //starting point is 0                                         print you are at starting point
         //ending point is 10                                          print you are at ending point
        // between those number (0-10) will be on my way               print you are on your way
        //anything left will be wrong way                              print some warning mesagaes


        int point=190;

        if (point ==0) {
            System.out.println("You are starting point"); //covered 1 scnering whic is 0

        }else if(point==10){
            System.out.println("You are ending point"); // covered 1 scnering whic is 10
        }else if (point >=0 && point<=10){
            System.out.println("You are on your way");//0 1 2 3 4 5 6 7 8 9 10
        }else{
            System.out.println("you are on wrong way");
            System.out.println("please check your way"+ point);
            System.out.println("point has to be between 0-10");
        }











    }
}
