package Day06_Nestedif_Switch;

public class c4_switchStatement {
    //create a java progmra that wil take nmers between 1-12
    //and print months name depends on number
    //ex
    //1----jan
    //--- may

    //eger break koymazsan diger ayi hesaplayamaz bir sonraki siraya gecmesi icin bbreak koymalisin.


    public static void main(String[] args) {
        int number =10;
                String monthName;

        switch (number){//switch will ask you to pass a variable that will might have different cases
            case 1 :monthName="Jan" ; //switch will check number if it match with the case= 1 it will make month name as a jan

                 break;//break will break all switch after cathcing the matching case number
            case 2:monthName="Feb";
                 break;
            case 3 :monthName="Marc";
                 break;
            case 4:monthName="April";
                 break;

            case 5 :monthName="May";
                 break;
            case 6:monthName="Jun";
                 break;

            case 7 :monthName="July";
                 break;
            case 8:monthName="Agust";
                 break;
            case 9 :monthName="Sep";
                 break;
            case 10:monthName="Oct";
                 break;
            case 11 :monthName="Nov";
                 break;
            case 12:monthName="Dec";
                 break;

            default:monthName="Invalid number entered Please check number";
                 break;
            //break: optional to use becauese we dont have any case left
            //if you wanna add something yo uour variabe and same time keep what you have
                  //  you will either do result = result  + "a"; //hello a
                  //or shortcut result = +="a" ; //hello a
        }

        System.out.println(monthName);

        char letter= 'a' ;
        String result = " Hello " ;

        //3 case with a b c
        //if the case is a result should be Hello a
        //if the case is b result should be Hello b
        //if the case is c result should be Hello c
        //if letter is is something else then Hello Invalid.
        //result = "asdas" this is how you reassigned the variable

        switch (letter){
            case 'a' :
                result+=  "a" ;  // result= result + "a" ;
               break;
            case 'b' :
                result += "b" ; //hello b // result =hello b
                break;  //bunu burdan silersen result hello bc okuyacak yani bi sonraki satiri da  birlikte okuyacak
            case 'c' :
                result +="c" ; // result gonna be = hello bc
                break;
            default:
                result+="Invalid" ;
        }

        System.out.println(result);


        // in the switch first it will check matcing case
        //an then it will excute all ines after your case gets break






















    }
}
