package basic_4_exercise;

public class BubbleSortArray {
    public static void main(String[] args) {
        int [] arr = {64, 34, 25, 12, 22, 11, 90};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n-i-1; j++) {

                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
                if (!swapped) {
                    break;
                }
            }
            }
        System.out.println();
        System.out.println("Sorted arr is:");
            for(int num: arr){
                System.out.print(num+" ");
        }
    }
}
