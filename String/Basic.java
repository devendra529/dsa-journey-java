import java.util.*;
class Basic{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a s value");
        String s=sc.next();
        System.out.println("enter a paragraph");
        String para=sc.nextLine();
        System.out.println(s);
        System.out.println(para);
        System.out.println("enter the length of the s");
        System.out.println(s.length());
        System.out.println("length of para" + para.length());

    }
}