package example.array;

public class SecondLargest {

    public static int findSecondLargest(int[] arr) {
        int max, secMax;
        max = secMax = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > max) {
                secMax = max;
                max = x;
            } else if (x > secMax && x != max) {
                secMax = x;
            }
        }
        return secMax;
    }

    public static void main(String[] args) {
        // int[] arr = {2, 3, 5, 7, 6, 11, 13, 18, 9, 14};
        //int[] arr = {9,3,6,2,9};
        //int[] arr = {6, 6, 6, 6, 6, 6, 6};
        int [] arr = {};
        System.out.println(findSecondLargest(arr));
    }
}