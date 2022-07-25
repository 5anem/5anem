package day04_ifStatements;

public class c4_OparatorsContinue {
    public static void main(String[] args) {


     int x=125;
     System.out.println(x);


     //if you wanna reassing yur variable you should call it by variable name
     x=100;

     System.out.println(x);

     x=x+10;// x==110
     x=x+20;//110+20==130
      System.out.println(x);

     x +=20; // x = x+20 ----- 130 + 20=150
        System.out.println(x);


     int y=20;
     y=y+20;//40
     y +=20;//60
     y *=2;//120

     x = -y;  // x  -120
     System.out.println(x);

     x -= y;  //x = x-y = -120 -120 == -240

    // -= or += means add or remove up to ypur number

    System.out.println("********************");
    int z = 10;
    int w = 20;

    System.out.println(z);
    z = w - z + 10 + --z;
    //z = 20 - 10 +10 + 9 --z(pre condition yani birer birer azaltmis hali 9) = 29

    z -= z+z-z+20 ;
    z -= z+20;// 29 -49 = -20

     System.out.println(z);


     int number =20;
     number *= 2;

     //numer = number * 2


       System.out.println(number);

       number /= 2;
       System.out.println(number);











 }



}
