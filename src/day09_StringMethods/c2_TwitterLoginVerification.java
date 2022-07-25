package day09_StringMethods;

import java.util.Scanner;

public class c2_TwitterLoginVerification {
    public static void main(String[] args) {



        //create a logic that will check login function of facebook,twitter,gmail.
        //correct username = renastech
        //correct password = renastech123

        //use scanner here to pass usernames and passwords
        //do validation of those usernames and password matching with correct credentials


        String expectedUserName="renastech";
        String expecteDpASSWORD="renastech123";


        //correct credentiale ----- it should be pass
        //false credential   -------it should be fall
            //false username true password
            //false password true username
            //false username true password






        Scanner input=new Scanner(System.in);//this will create an object from scanner class

        System.out.println("Enter UserName : ");
        String userInputForuSENAME=input.nextLine();
        System.out.println("Enter Password : ");
        String userInputForPassword=input.nextLine();

        //to be able to login username and pssword has to match our expected data

        if (userInputForPassword.equals(expectedUserName) && userInputForPassword.equals(expecteDpASSWORD)) {
            System.out.println("You have succesfully logged in ! ");
        }else
        System.out.println("Login function has failed");
        System.out.println("Invalid credantials please check your credentials");
        System.out.println("Credantials are :" + userInputForuSENAME + " , " + userInputForPassword);


    }
}
