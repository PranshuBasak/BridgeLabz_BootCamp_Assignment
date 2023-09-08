public class FindFrequencyOfElement {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 2, 6, 7, 1, 8, 9, 10, 3, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,1, 2, 3, 4, 5, 2, 6, 7, 1, 8, 9, 10, 3, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40 };

        System.out.println("Elements of Array");
        for (int j : arr) {
            int n = count(j, arr);
            System.out.println(j + " is occuring for " + n + " Times");
        }
    }

    private static int count(int i, int[] arr) {
        int n = 0;
        for (int j: arr) {
            if(arr[i] == j){
                n += 1;

            }
        }
        return n;
    }
}
