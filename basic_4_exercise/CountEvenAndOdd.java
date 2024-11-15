package basic_4_exercise;

public class CountEvenAndOdd {
    public static void main(String[] args) {
        int[] arr = {12, 16, 34, 23, 87, 54, 4, 76, 9, 3};
        System.out.println("Count the even and odd numbers: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Count the odd numbers: ");
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count1 += arr[i];
            }
        }
        System.out.println(count1);

        System.out.println("Count the even numbers: ");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count += arr[i];
            }
        }
        System.out.println(count);
    }
}
