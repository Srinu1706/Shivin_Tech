package Logical;

public class Count_char {
    public static void main(String[] args) {
        String string = "srinu@2002";

        int alphaCount = 0;
        int numberCount = 0;
        int specialCount = 0;

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (Character.isLetter(ch)) {
                alphaCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            } else {
                specialCount++;
            }
        }
        System.out.println(alphaCount);
        System.out.println(numberCount);
        System.out.println(specialCount);
    }

}
