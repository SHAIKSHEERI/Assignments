public class StringMethod {

	public static void main(String[] args) {
		String str1 = "Java String pool refers to collection of String which are stored in heap memory";
		String str2 = "Java String pool refers to collection of String which are stored in heap memory";
		System.out.println("Lower case: "+str1.toLowerCase());
		System.out.println("Upper case: "+str1.toUpperCase());
		System.out.println(str1.replace('a','$'));
		System.out.println("Verify: "+str1.contains("Collection"));
		System.out.println("Equal or not: "+str1.equals(str2));
		System.out.println(str1 == str2);
		

	}

}
