public class Amstrong {
    public static void main(String[] args) {
        int number = 153;
        int temp = number;
        int sum = 0;
        while (number > 0) {

            int digit = number % 10;
            sum = sum + (digit * digit * digit);
            number = number / 10;
        }
        System.out.println(sum==temp?"yes its a Amstrong":"No its not a Amstrong");
    }
}
