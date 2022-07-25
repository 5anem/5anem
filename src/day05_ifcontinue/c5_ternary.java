package day05_ifcontinue;

public class c5_ternary {

    public static void main(String[] args) {





        int number1=19;
        int number2=9;

        int max = 0;              //this is the store max number
        String message = "";      // this is the message it will be printing the end the
        if (number1 > number2){   //it is not going to check here
            max=number1;
        }else {//it will be true
            max=number2; } //max=number1 =19
        System.out.println(max);


        //System.out.println("Mximum number is" + max )
        message=" Maximum number is " +number1;
        System.out.println(message);



        ///ternary

        int number3=35;
        int number4=45;



        int max2;

        max2= (number3 > number4) ? number3 : number4  ;

        //if   present  ?
        //else present  :

        System.out.println(max2);

        String result= "";

        result= (false) ? "Java" : "Python";

        System.out.println(result);

        if(false){
            result="java";

        }else {
            result="python";
        }
        System.out.println(result);


            




        







    }
}
