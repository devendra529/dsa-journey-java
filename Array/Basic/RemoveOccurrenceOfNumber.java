import java.util.Scanner;

class Occurrence {

    int remove(int[] arr, int k) {

        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != k) {   // keep only non-k elements
                arr[j] = arr[i];
                j++;
            }
        }

        return j; // new length
    }
}

public class RemoveOccurrenceOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.print("Enter k (element to remove): ");
        int k = sc.nextInt();

        System.out.println("Enter 5 array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Occurrence obj = new Occurrence();
        int newLength = obj.remove(arr, k);

        System.out.println("New length = " + newLength);
        System.out.print("New array = ");

        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
