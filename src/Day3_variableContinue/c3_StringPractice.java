package Day3_variableContinue;

public class c3_StringPractice {

    // create 3 name and assign any name
    //  create 4 age assign any number you want to 20 30 40
    // print those age with person name  sanem age is 20
    // also sum those age with persin age 20+30+40
    // print "Sum of persons Age= 90" ;





    public static void main(String[] args) {
        String name1="Sanem";
        String name2="Jassy";
        String name3="Beri";


        int age1=22;
        int age2=24;
        int age3=24;



        System.out.println("Sanem age is :22");

        // print those age with person name  sanem age is 20
        System.out.println(name1 + " age is :" + age1);
        System.out.println(name2 + " age is " + age2);

        System.out.println("Person 1 name is :" +name1);

        // also sum those age with persin age 20+30+40
        // print "Sum of persons Age= 90" ;
        System.out.println("Sum of the person age is :"+age1 + age2);// text +  number + number= text
        System.out.println("Sum of the person age is :"+ (age1+age2));//text +(number+number)==text

        int sumOfAges=age1+age2;

        System.out.println("Sum of Ages : " +sumOfAges);


    }

}
