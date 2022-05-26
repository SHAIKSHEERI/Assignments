public class PhoneDirectoryWithTreeMap {

	public static void main(String[] args) {
		PhoneDirectoryWithTreeMap directory = new PhoneDirectoryWithTreeMap();
		System.out.println("This program creates a PhoneDirectoryWithTreeMap and");
		System.out.println("adds several entries.  It then prints the contents of");
		System.out.println("directory and does a few lookups.");
		System.out.println();
		directory.putNumber("sheerin","555-1234");
		directory.putNumber("maahir","555-2345");
		directory.putNumber("sunny","555-3456");
		System.out.println("Contents are:");
		System.out.println();
		directory.print();
		System.out.println();
		System.out.println("Number for sherin is " + directory.getNumber("sheerin"));
		System.out.println("Number for maahir is " + directory.getNumber("maahir"));
		System.out.println("Number for sunny is " + directory.getNumber("sunny"));
		// The output from the last line should be null.
	}

	private String getNumber(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private void print() {
		// TODO Auto-generated method stub

	}

	private void putNumber(String string, String string2) {
		// TODO Auto-generated method stub

	}

}
