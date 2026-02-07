// count the number of occurences of an element of a particular element x.

import java.util.Scanner;

class Counter{
    int occurence(int []arr , int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]==x){
            count++;
           }
        }
        return count;
    }
}
 public class Occurences_01{
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int x= sc.nextInt();
          System.out.println("enter the size of the array");
          int N =sc.nextInt();
          int []arr = new int[N];
         for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
          }
          Counter obj=new Counter();
          int result=obj.occurence(arr, x);
          System.out.println(result);
    }
}