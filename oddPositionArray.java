public class oddPositionArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 2, 6, 7, 1, 8, 9, 10, 3, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,1, 2, 3, 4, 5, 2, 6, 7, 1, 8, 9, 10, 3, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,1, 2, 3, 4, 5, 2, 6, 7, 1, 8, 9, 10, 3, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22,0 };

        System.out.println("Even Position Elements of Array");

        even(arr);
    }

    private static void even(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            if (j % 2 == 0) {
                System.out.println(arr[j]);
            }
        }
    }
}
