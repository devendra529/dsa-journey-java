class ArrayCheck {
    static boolean sorted(int[] arr) {

        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                increasing = false;
            }
            if (arr[i] < arr[i + 1]) {
                decreasing = false;
            }
        }

        return increasing || decreasing;
    }
}

public class Array_sorted_or_not {
    public static void main(String[] args) {
        int[] arr = {1, 5,6,7,8};
        System.out.println(ArrayCheck.sorted(arr));
    }
}
