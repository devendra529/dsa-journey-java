public class RemoveDuplicate {

    static String remove(String word) {
        char[] arr = word.toCharArray();
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            if (result.indexOf(arr[i]) == -1) {
                result += arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(remove("programming"));
    }
}