
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Twodifferentarrays {
public static final <T> void swap (T[] a, int i, int j) {
T t = a[i];
a[i] = a[j];
a[j] = t;
}

public static final <S> void swap (List<S> l, int i, int j) {
Collections.<S>swap(l, i, j);
}

private static void test() {
String [] a = {"Hello", "Goodbye"};
swap(a, 0, 1);
System.out.println("a:"+Arrays.toString(a));
List<String> l = new ArrayList<String>(Arrays.asList(a));
swap(l, 0, 1);
System.out.println("l:"+l);
}
public static void main(String...args)
{
test();
}

}