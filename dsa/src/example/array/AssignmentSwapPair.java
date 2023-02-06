package example.array;

public class AssignmentSwapPair {

    public static void swapPairNumber(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i += 2) {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {9, 3, 6, 12, 4, 32,11};
        System.out.println("Before Swapping :");
        for (int x : arr) {
            System.out.print(" " + x);
        }
        swapPairNumber(arr);
        System.out.println("\n After Swapping :");
        for (int x : arr) {
            System.out.print(" " + x);
        }

    }
}
