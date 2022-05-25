public class Insert {
	public static void main(String[] args) {
		StringBuffer s1= new StringBuffer("it is used to _ at the specified index position.");
		s1.replace(14,15,"insert text");
		System.out.println(s1);
	}

}
