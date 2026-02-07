import java.util.Arrays;

public class Kth_smallest_number {
    public static void main(String[] args) {
        int arr[]={1,4,2,7,3,5};
        int k=3;
       Arrays.sort(arr); 
       System.out.print(arr[k-1]);


    }
}
