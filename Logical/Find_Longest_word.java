package Logical;

public class Find_Longest_word {
    public static void main(String[] args) {
        String word="Java Spring Boot";
        String words []=word.split(" ");
        String maxLength="";
        for(String wor:words){
            if (wor.length()>maxLength.length()) {
                maxLength=wor;
            }
        }
        System.out.println(maxLength);
    }
}
