class Counter {
    static int countTriplets(int[] arr, int target) {

        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {

                    int total = arr[i] + arr[j] + arr[k];

                    if (total == target) {
                        ans++;
                    }
                }
            }
        }

        return ans;
    }
}

public class Triplate_sum {
    public static void main(String[] args) {

        int[] arr = {4, 8, 5, 1, 3, 5, 6, 7, 9, 8, 4, 1, 2, 5};
        int target = 8;

        int result = Counter.countTriplets(arr, target);
        System.out.println(result);
    }
}