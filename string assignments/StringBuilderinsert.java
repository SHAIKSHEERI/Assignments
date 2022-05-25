public class StringBuilderinsert {
	public static void main(String[] args) {
		StringBuilder s1= new StringBuilder("it is used to _ at the specified index position.");
		s1.replace(14,15,"insert text");
		System.out.println(s1);
    }

}
