package Day06_Nestedif_Switch;

public class c2_nestedIf {


    //simply neseted is if cinfitions inside of if conditions
    //if the main if condition is true then you woll check sub if condition

    public static void main(String[] args) {



     //this task :
        //create  java program  that score of student and prints the grade of student
        //between 100 to 51 is grade A
        //between 0 to 50 is grade B
        //if number is not between 0-100 grade 0 ,, " invalid number"
        //if student absent
        //if number is valid number


        int score = 25;
        String attend = "Yes"; //yes. no
        String result = "";

        if (attend == "Yes"){ //Java is case snsitive language make sure to pass exact match
            if (score >= 51 && score<=100){
                //this will apply where student was present and
                //have score between 51 to 100
             result= "Student was present and Student Score is " + score + "Grade is A";



            }else if (score >=0 && score < 50){
                result="Student was present and Student Score is" + score + "Grade is B";
            }else{
                result= "Student was present and Student Score is" + score+"Invalid number Check Score !!!!";
            }
        } else if(attend=="No"){
                result="-----------Student was Absent-----------" ;




            }else{ // this will cover invalid chahrachters for attendence
                result="!!!!! Invalid Text for Attendece Please check Attendece !!!" + attend;
            }
            System.out.println(result);











        }









































    }

