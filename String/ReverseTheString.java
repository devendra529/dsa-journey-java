
public class ReverseTheString {

    static String reverse(String word) {
        char[] arr = word.toCharArray();
        char[] reversed = new char[arr.length];

        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed[j] = arr[i];
            j++;
        }

        return new String(reversed);
    }

    public static void main(String[] args) {
        String word = "hello";
        System.out.print(reverse(word));
    }
}