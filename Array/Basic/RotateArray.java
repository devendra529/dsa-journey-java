public class RotateArray {

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void rotateRight(int[] arr, int k) {
        int n = arr.length;

        k = k % n;  // important

        reverse(arr, 0, n - 1);     // 1) reverse full
        reverse(arr, 0, k - 1);     // 2) reverse first k
        reverse(arr, k, n - 1);     // 3) reverse remaining
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotateRight(arr, k);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
