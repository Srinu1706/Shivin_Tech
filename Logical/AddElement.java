package Logical;
public class AddElement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 6, 7, 8 };

        int position = 4;

        int element = 5;

        int NewArray_position = 0;

        int newArray[] = new int[arr.length + 1];

        for (int i = 0; i < position; i++) {
            newArray[NewArray_position++] = arr[i];
        }

        newArray[NewArray_position++] = element;

        for (int i = position; i <= arr.length - 1; i++) {
            newArray[NewArray_position++] = arr[i];
        }

        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}
