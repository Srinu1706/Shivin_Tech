package Logical;

public class CountWords {
    public static void main(String[] args) {
        String sr = "Srinivas srinu bandaru";
        int count = 1;
        for (int i = 0; i < sr.length(); i++) {
            char ch = sr.charAt(i);
            if (ch == ' ') {
                count++;
            } else {

            }

        }
        System.out.println(count);
    }

}
