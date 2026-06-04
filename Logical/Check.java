package Logical;

public class Check {

    public static void main(String[] args) {
        String string = "123a45";
        boolean isDigit = true;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch < '0' || ch > '9') {
                isDigit = false;
                break;
            }
        }
        System.out.println(isDigit);
    }
}