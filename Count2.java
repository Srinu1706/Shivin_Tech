import java.util.Arrays;

public class Count2 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 2, 2, 2 };
        // int count = 0;
        // for (int i = 0; i <= arr.length - 1; i++) {
        //     if (arr[i] == 2) {
        //         count++;

        //     }

        // }
        // System.out.println(count);

        Long count=Arrays.stream(arr).filter(number->number==2).count();
        System.out.println(count);
    }
}
