package Sorting;

public class BubbleSort {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        // Time Complexity= O(n^2)

        int[] arr = {7, 8, 3, 1, 2};
        // Bubble Sort

        // (arr.length-1) represents that n-1 elements will be sorted, last one will be sorted automatically
        for (int i = 0; i < arr.length - 1; i++) {
            // In first iteration no element is sorted, in second iteration 1 element is sorted, third iteration sorts the 2 elements and so on, that is why (arr.length-i-1)
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1])// element at an index is greater in value than next element then swap
                { //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }
}
