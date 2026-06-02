package Logical;

public class StringCompression {
    public static void main(String[] args) {
        String string = "aaabbc";
        String result = "";
        int count = 1;
        for (int i = 0; i < string.length() - 1; i++) {
            if (string.charAt(i) == string.charAt(i + 1)) {
                count++;
            } else {
                result += string.charAt(i) + count;

                count = 1;
            }
        }
        result += string.charAt(string.length() - 1) + count;

        System.out.println(result);
    }
}