import java.util.Date;
import java.util.HashMap;
public class Pair
{
	public static void main(String args[]) {
		pair1<String,String>p=new pair1<String,String>("1","Hello");
		HashMap<String,String>
		h=new HashMap<String, String>();
		pair1<String,Date>
		p1=new pair1<String,Date>("Today is ",new Date());
		h.put(p.getkey(),p.getvalue());
		System.out.println(h);
		HashMap<String,String>
		h1=new HashMap<String,String>();
		h1.put(p1.getkey(),p1.getvalue());
		System.out.println(h1);
	}
}
