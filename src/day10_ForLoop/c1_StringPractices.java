package day10_ForLoop;

public class c1_StringPractices {
    public static void main(String[] args) {


        //How do you spit a sentencce based in spesific character ?

        String sentence = "Hello Java is planet ,java is beautiful java is best ";

        //to split from second java
        int indexOfPlanet= sentence.indexOf("java is b");
        String splitedSentence=sentence.substring(indexOfPlanet);
        System.out.println(splitedSentence);


        System.out.println(sentence.length());//52+1=  53
        //lenght is equal = last index +1
        System.out.println(sentence.lastIndexOf(" "));//52
        System.out.println(sentence.length() -1);//last index




































































































    }
}
