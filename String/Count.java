// In this wwe check thaat how much vowel and the consonent present in the word
import java.util.*;
public class Count {
    static void Checker(String word){
        char arr[]=word.toCharArray();
        int count=0;
        int count1=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] == 'a' || arr[i] == 'e' || 
                arr[i] == 'i' || arr[i] == 'o' || 
                arr[i] == 'u') {
                       count++;
            }
            else{
                count1++;
            }
        }
       System.out.println("vowel is: "+ count);
       System.out.print("consonent : "+ count1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        Count.Checker(word);
    }
}
