public class AscendingOrderOfArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 2, 6, 7, 1, 8, 9, 10, 3, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,1, 2, 3, 4, 5, 2, 6, 7, 1, 8, 9, 10, 3, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
            System.out.println("Element in Ascending Order");
        for (int j : arr) {
            System.out.print(j+", ");
        }
    }

    
}
