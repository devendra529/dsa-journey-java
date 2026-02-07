//find the pair of sum is equal to the target find the count

class pair{
    int target_sum(int arr[], int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
            int sum=arr[i]+arr[j];
            if(sum==k){
            count++;
        }
        }
    }
        return count;
    }
}
public class Pair_target_sum {
    public static void main(String[] args) {
        int arr[]={4,3,5,4,5,2};
        int k=7;
        pair obj =new pair();
        int result=obj.target_sum(arr, k);
        System.out.println(result);
    }
}
