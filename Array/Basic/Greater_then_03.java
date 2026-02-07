// compare the value x for all the index and and count how many umber is greater

class counter{
    static int greater(int arr[] ,int x){
        int count =0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>x){
                count++;
            }
        }
        return count;
    }
}

public class Greater_then_03 {
    public static void main(String[] args) {
        int arr[]={1,5,4,2,8,6,3};
        int x=3;
        int result =counter.greater(arr, x);
        System.err.println(result);
    }
}
