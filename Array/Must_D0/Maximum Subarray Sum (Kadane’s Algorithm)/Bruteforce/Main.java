/*Maximum Subarray Sum (Kadane’s Algorithm)

 Concept: Greedy + DP thinking

Problem:
Find the maximum sum of a contiguous subarray.

Example:
[-2,1,-3,4,-1,2,1,-5,4] → Output: 6
(Subarray = [4,-1,2,1]) */

//duing using bruteforce
import java.util.*;
class subarray{
      int maximum(int arr[]){
         int greater=0;
         for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                 greater=Math.max(greater,sum);
            }
         }
         return greater;
      }    
}
//printing the subarray  
class ArrayPrint {
    void printMaxSubarray(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];

        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > currentSum + arr[i]) {
                currentSum = arr[i];
                tempStart = i;
            } else {
                currentSum = currentSum + arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        // print result
        System.out.println("Maximum Sum: " + maxSum);
        System.out.print("Subarray: ");

        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of the array:");
        int n= sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Output is:");
        subarray obj =new subarray();
        System.out.println(obj.maximum(arr));
        ArrayPrint obj1 =new ArrayPrint();
        obj1.printMaxSubarray(arr);
    }
}
