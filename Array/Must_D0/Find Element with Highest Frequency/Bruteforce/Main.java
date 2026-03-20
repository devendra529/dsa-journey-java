/*Concept: HashMap + traversal

Idea:

Count frequency

Find max value */
import java.util.*;
class frequency{
    int maxfrequency(int arr[]){
        int result=-1;
        int maxfre =0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(maxfre < count){
                maxfre=count;
                result =arr[i];
            }
        }
        return result;
      
    }
}
public class Main {
    public static void main(String[] args) {
          Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of the array:");
        int n= sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("output is:");

        frequency obj =new frequency();
        System.out.println(obj.maxfrequency(arr));
    }
}
