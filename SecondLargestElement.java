public class SecondLargestElement {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 2, 6, 7, 1, 8, 9, 10, 3, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,1, 2, 3, 4, 5, 2, 6, 7, 1, 8, 9, 10, 3, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,1, 2, 3, 4, 5, 2, 6, 7, 1, 8, 9, 10, 3, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22, };

        System.out.println("Largest Element of Array");
        int n = secondL(arr);
        System.out.println(n);
    }

    private static int secondL(int[] arr) {
        int l = 0, s = 0;
        for (int j : arr) {
            if (j > l) {
                s = l;
                l = j;
            } else if (j > s && j < l) {
                s = j;
            }
        }
        return s;
    }
}
