package Day3_variableContinue;

public class c7_postPreConditions {
   public static void main(String[] args) {

        int x= 10; // post pre condition will effect this number

        System.out.println(x);//10
        //pre condition
        System.out.println(++x); //pre contition will increase your number by one immediately(hemen) //11
        System.out.println(x);//11

        System.out.println(+x); //one plus wont add anything it will effect number if possitive or negative //11

        int y=20;
        System.out.println(y); //20
        System.out.println(y++);//post condition will increase(arttirmak) the number on text stop//20
        System.out.println(y);//21

       x= x+5;

       System.out.println(x+5);



    }







}
