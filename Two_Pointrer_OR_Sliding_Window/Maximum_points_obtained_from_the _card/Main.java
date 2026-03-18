public class Main {
    public static void main(String[] args) {
        int arr[] = {6,2,3,4,7,2,1,7,1};
        int k = 4;

        int sum = 0;

        // Step 1: take first k elements
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxsum = sum;
        int last = arr.length - 1;

        // Step 2: slide
        for (int i = k - 1; i >= 0; i--) {
            sum -= arr[i];        // remove from left
            sum += arr[last];     // add from right
            last--;

            maxsum = Math.max(maxsum, sum);   // using the max function to find the maxinmum
        }

        System.out.println("maximum sum is " + maxsum);
    }
}
