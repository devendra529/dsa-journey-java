/*Problem:
Find two indices such that their sum equals target.

Example:
nums = [2,7,11,15], target = 9 → [0,1] */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target:");
        int target = sc.nextInt();

        int start = -1, end = -1;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    start = i;
                    end = j;
                    break;
                }
            }
        }

        if (start != -1) {
            System.out.println("Indices: " + start + " " + end);
        } else {
            System.out.println("No pair found");
        }
    }
}