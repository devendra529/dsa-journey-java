class Learning{
    public static void main(String[] args){
        StringBuilder sb =new StringBuilder();
        //append add the text to the end
        sb.append("hello Devendra");
        sb.append("how are you");
        System.out.println(sb);
        //insert at specific possition
        sb.insert(1, "new");
        System.out.println(sb);
        // replace partof string
        sb.replace(0, 1, "hello world");
        System.out.println(sb);
        //delete()  delete character
        sb.delete(0, 1);
        System.out.println(sb);

        sb.append("devendra");
        // reverse the string
        sb.reverse();
        System.out.println(sb);
        //find the length of the array
        sb.length();
        System.out.println(sb);

        //charAt()  
        char ch =sb.charAt(0);
        System.out.print(sb);
     }
}