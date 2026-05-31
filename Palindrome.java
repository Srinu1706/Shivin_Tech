import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        String reverse = "";

        while (!stack.isEmpty()) {
            reverse = reverse + stack.pop();
        }
        System.out.println(str.equals(reverse) ? "Palindrome" : "Not Palindrome");
    }
}