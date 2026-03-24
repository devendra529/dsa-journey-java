public class Reverse_a_String {
    public static void main(String[] args) {
        String s = "welcome to the world";
        StringBuilder sb =new StringBuilder();
        sb.reverse();
        System.out.println(sb);

        // if want to reverse the one word from the sentence the what the approach
        String[] str = s.split(" ");
        for(int i=0;i<str.length;i++){
            if(i==1){
                str[i] = sb.reverse().toString();
            }
        }
        String result =String.join("", str);
        System.out.print(result);
    }
}
