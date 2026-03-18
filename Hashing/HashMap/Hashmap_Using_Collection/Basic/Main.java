
import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args){
      HashMap <String, Integer> mp =new HashMap<>();

      //INSERT THE ELEMENT 
      //using the put we can insert
      mp.put("dev",22);
      mp.put("bhar",23);
      mp.put("rag",24);
      mp.put("avi",25);
      mp.put("devendra",26);
      mp.put("anurag",27);
      System.out.println(mp);
      
      // getting the value 
      // it can peerform using get method
      System.out.println(mp.get("dev"));
      System.out.println(mp.get("anurag"));
      System.out.println(mp.get(23)); // not possible to get the key using the value
      //but if we want to find the key using the value then uaing brute force and the reverse hashmap

      //if we want to update the value the it perform using put method
      //put is used for two things 1. it is used for insertion  2. used for updation

      mp.put("dev", 21);
      System.out.println(mp.get("dev"));

      // if we want to remove the pair the we use the remove method
      mp.remove("anurag");
      System.out.println(mp.get("anurag"));

      // if we want to check that key is exist in the map or not sso used the containkey
      System.out.println(mp.containsKey("dev"));
      System.out.println(mp.containsKey("anurag"));

      //if we want to geting all keys in this hashmap the use the keyset
      System.out.println(mp.keySet());

      System.out.println(mp.entrySet());

      //Traversing all the entries of hashmap using multiple method

     for (String key : mp.keySet()) {
    System.out.println("age of " + key + " is " + mp.get(key));
}

         // traversing using entrySet()
        for (Map.Entry<String, Integer> a : mp.entrySet()) {
            System.out.println(a.getKey() + " -> " + a.getValue());
        }

 
    }
}