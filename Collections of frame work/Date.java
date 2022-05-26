// Java program to check if
// given date is valid or not.
import java.io.*;

@SuppressWarnings("unused")
class Date
{

	static int MAX_VALID_YR = 2000;
	static int MIN_VALID_YR = 1800;

	// Returns true if
	// given year is valid.
	static boolean isLeap(int year)
	{
		// Return true if year is
		// a multiple of 4 and not
		// multiple of 100.
		// OR year is multiple of 400.
		return (((year % 4 == 0) &&
				(year % 100 != 0)) ||
				(year % 400 == 0));
	}

	// Returns true if given
	// year is valid or not.
	static boolean isValidDate(int d,
			int m,
			int y)
	{
		// If year, month and day
		// are not in given range
		if (y > MAX_VALID_YR ||
				y < MIN_VALID_YR)
			return false;
		if (m < 1 || m > 12)
			return false;
		if (d < 1 || d > 31)
			return false;
		return true;}

	public static void main(String args[])
	{
		if (isValidDate(23, 12, 2000))
			System.out.println("it was a leap year");
		else
			System.out.println("it was not a leap year");

		if (isValidDate(23, 12, 2001))
			System.out.println("it was a leap year");
		else
			System.out.println("it was not a leap year");
	}
}


