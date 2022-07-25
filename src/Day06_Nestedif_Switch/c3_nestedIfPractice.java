package Day06_Nestedif_Switch;

public class c3_nestedIfPractice {

    public static void main(String[] args) {

















        //create a java program to ceck if person is eligible to give blood
        //requirement to give lood :
        //person needs to be older than 18
        //person weight needs to be more then 50


        //expected output :
        //if person age is smaller and equal to 18
        //print : "Person needs to be older then 18"
        //if person is eligible
        //"Person eligible to give blood "
        //if persoon is not
        //"Person is not eligible to give blood"

        //example eset datda is person age is 15 weight is 150
        //'person needs to be older then 18"
        //example test data is person age is 20 weigt is 4o
        //"Person is not eligble to give blood"
        //example test data is person age is 20 weight is 100
        //"Person is eligilebe to give blood "

        //example test data person is age is 18 weight is 55
        //"Person needs to be older then 18"


        String personName="SANEM";
        int age = 25 ;
        //byte float or double//
        //byte is not reasonable (because weight can be more than 128)
        //int (not useful because it all number wight can be decimal as weel)
        //float and double okay for us
        double weight = 75.25 ;
        String result="" ;


        if (age >18 ){
            if (weight > 50.00){
                result = personName+ " is eligible to give blood";
            }else{
                result= personName+ "is not eligible to give blood";
            }
        }else if (age <=18){
            result=personName+"Person needs to be older then 18";
        }else{
            result=personName+"Invalid Charachter entered !!!";
        }

        System.out.println(result);















































    }
}
