
import java.util.HashSet;
public class Hashset {
   public static void main(String args[]) {
      
      HashSet<String> hset = 
               new HashSet<String>();

      
      hset.add("Apple");
      hset.add("Mango");
      hset.add("Grapes");
      hset.add("Orange");
      hset.add("Fig");
      hset.add("Coconut");
      hset.add("Strawberry");
      hset.add("Blackberry");
      hset.add("Kiwi");
      hset.add("Roseberry");
      hset.add("Apple");
      hset.add("Mango");
      hset.add(null);
      hset.add(null);

      System.out.println(hset);
    }
}