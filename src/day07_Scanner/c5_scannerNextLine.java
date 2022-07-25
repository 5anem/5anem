package day07_Scanner;

import java.util.Scanner;

public class c5_scannerNextLine {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        System.out.println("enter full name");
       // String fullName=scan.next();  //next only accept one word so if you have 2 word better to use nextline

        String fullName=scan.nextLine();
        System.out.println(fullName);

        Scanner input = new Scanner(System.in);
        System.out.println("Employe first name" );
        String firstName= input.next();
        System.out.println("first name is : " + firstName);


        // input.nextInt(); //this will accept enter
        System.out.println("Full name of Employe " );
        String fullNAme=input.nextLine(); //accept enter
        System.out.println("full name is :  " + fullName);


        System.out.println("Employe Company Name");
        String companyName=input.nextLine(); //will accept enter
        System.out.println("Company name is : " + companyName);



        System.out.println(" enter Employe Age");
        int age =input.nextInt();
        System.out.println("Age is : " + age);

        //after passing age and clicking enter will be accepted on nextline
        input.nextLine();//handle enter after passing age

        System.out.println(" enter Employe city");
        String city=input.nextLine();
        System.out.println("City name =  " + city);

        System.out.println("Enter Salary of Employee");
        double salary=input.nextDouble();
        System.out.println("Salary is " +salary);













































    }
}
