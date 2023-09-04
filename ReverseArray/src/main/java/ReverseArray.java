
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
       int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements for the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("The reversed array is: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}