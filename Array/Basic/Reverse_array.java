public class Reverse_array {
    public static void main(String[] args) {

        int[] arr = {4, 5, 8, 3, 1, 2, 7, 9};
        int len = arr.length;

        int[] arr1 = new int[len];

        int j = 0;
        for (int i = len - 1; i >= 0; i--) {
            arr1[j] = arr[i];
            j++;
        }

        for (int i = 0; i < len; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
