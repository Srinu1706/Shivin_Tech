package Logical;

public class Reverse_Each_Word_in_a_Sentence {

    public static void main(String[] args) {
        String str = "Java Spring Boot";
        String word = "";
        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                for (int j = word.length() - 1; j >= 0; j--) {
                    System.out.print(word.charAt(j));
                }
                System.out.print(" ");
                word="";

            } else {
                word += str.charAt(i);
            }
        }
    }
}
