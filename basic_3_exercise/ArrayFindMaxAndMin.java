package basic_3_exercise;

public class ArrayFindMaxAndMin {
    public static void main(String[] args) {
        int[] arr = {12, 45, 2, 89, 23};

        System.out.println("Input:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max: " + max);

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min: " + min);


    }
}
