package basic_3_exercise;

public class ArrayTask1 {
    public static void main(String[] args) {
        int[] arr = {3, 8, 9, 4, 7};
        System.out.print("Input: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf( arr[i] + " ");
        }
        System.out.println(" ");
        System.out.printf("Output:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.printf( arr[i] + " ");
        }
    }
}
