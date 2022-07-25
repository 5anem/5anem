package day07_Scanner;

import java.util.Scanner;

public class c4_ScannerNext {
    public static void main(String[] args) {


        //for the strings to be able to use scanner you will need to call nex method frere from library
        //2 way to create string scanner
        //next nd nextline

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter First Name ");
        ////String firstanem= " Sanem " ;
        String firstname = input.next();
        System.out.println(" First name is " + firstname);

        System.out.println(" enter last name ");
        String lastName = input.next();
        System.out.println(" last name is " + lastName);

        String fullname = firstname + "" + lastName;
        System.out.println(fullname);

        System.out.println(" Grade for student ");
        int grade = input.nextInt();
        System.out.println(fullname + " grade is " + grade);


    }
}
