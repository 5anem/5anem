package day05_ifcontinue;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class c6_EvenOdd {
    public static void main(String[] args) {
        //create a java tjhat woll if number is even or add

        int number ;

        number=25 ;
        String result = "" ;

        // lets try with if

        if (number % 2 ==0){
            result = number + "number is even";

        }else {
            result=number+"number is odd" ;
        }
        System.out.println(result);

        //shortcut of println is sout

        //ternary
        //if == ?
        //else == :

        String result2 = (number % 2 ==0) ? "This number is even " : "Number is odd";

        System.out.println(result2);
                                          // BU IKISI ARASINDAKI FARKI KAVRA
        int num  ;

        num = 17;
        String result3 = (num % 2==0) ? num + " is even" : num + " is odd ";

        System.out.println(result3);






















    }

    }




