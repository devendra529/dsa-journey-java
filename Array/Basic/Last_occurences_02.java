//find the last occurences of the given array and number be x
import java.util.Scanner;
class Last{
    int occurence(int arr[], int x){
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x)
             ans=i;
        }
        return ans;
    }
}
public class Last_occurences_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("int the number want to search");
        int x=sc.nextInt();
        int N=sc.nextInt();
        int arr[]= new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        Last obj =new Last();
        int result= obj.occurence(arr, x);
        System.err.println(result);
    }
}
