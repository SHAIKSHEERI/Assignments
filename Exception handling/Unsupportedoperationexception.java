import java.util.Arrays;
import java.util.List;
  
public class Unsupportedoperationexception {
    public static void main(String[] args)
    {
        String str[] = { "sheerin", "sunny" };
        List<String> l = Arrays.asList(str);
        System.out.println(l);
  
        // It will throw java.lang.UnsupportedOperationException
  
        l.add("Maahir");
    }
}