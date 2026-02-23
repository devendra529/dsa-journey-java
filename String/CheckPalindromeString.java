import java.util.*;
public class CheckPalindromeString {
    static boolean check(String Word){
        char [] arr =Word.toCharArray();
        // solving this problem with the two pointer approach
         int i=0;  
         int j=arr.length-1;    
         while(i<j){
            if(arr[i]!=arr[j]){
                  return false;
            }
            i++;
            j--;
         }
            return true;
          }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the String which we want to check");
        String Word=sc.next();
        System.out.println("String which we want to chack is this palindrome are: "+ Word);
        System.out.println(CheckPalindromeString.check(Word));
    }
}
