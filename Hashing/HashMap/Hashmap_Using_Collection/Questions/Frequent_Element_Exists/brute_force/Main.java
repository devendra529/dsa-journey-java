// int the given array find the most frequent element it.
// finding maximum frequent elemnt that appear in the array
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int arr[] = {1,2,3,1,1,2,3};
        Arrays.sort(arr);    //sort the array 

        int maxfre = 1;
        int count = 1;
        int mostFrequent = arr[0];

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1; // reset count
            }

            if(count > maxfre) {
                maxfre = count;
                mostFrequent = arr[i];
            }
        }

        System.out.println("Most Frequent Element: " + mostFrequent);
    }
}