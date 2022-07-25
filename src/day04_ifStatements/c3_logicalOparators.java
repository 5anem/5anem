package day04_ifStatements;

public class c3_logicalOparators {

    //&& ---- and
    //||------or
    //!-------not


    public static void main(String[] args) {


        //&&-----and  sadece 1 ise sonuc true olur
        System.out.println((5>3) && (3>5) );//FALSE
        System.out.println((10>3) && (5>5) );//FALSE
        System.out.println((1==1) && (2!=1));//true

        //if you re using oparotor only option that you will get your result is all conditions true
        //other then that alwawys be false



        //||------or 1 ya da 0 her zaman 1 // 1 or 0 always gonna be 1 that  mean is true // iceride sadece 1 varsa sonuc her zaman 1dir

        System.out.println((5>3) || (3>5) );//false or true is gonna be true
        System.out.println((10>3) || (5>5) );//FALSE or false gonna be fasle
        System.out.println((1==1) || (2!=1));//true or true is true


        //!-------not

        //!true ---==false // degil yapar
        //!!false--==false //degilin degili kendisidir

        boolean bool1=true;
        boolean bool2= !(10 !=15);//fasle
        System.out.println(bool1 && bool2);

        boolean bool3=!!!!!!bool1;//true

        boolean bool4=!(1==1);//false

        System.out.println(bool3||bool4);//1 ya da 0 == 1 tatlim //true

        System.out.println(("bahar" == "Bahar") || ("ridvan" !="Ridvan")); //false || true ==true
        //Java is case sensitivy language //to be able to ompare 2 string they have to have exact match











    }

}
