import java.util.ArrayList;
import java.util.Scanner;

public class Solution3 {
	public static void main(String[] args) {

		Scanner sc = null;
		int count = 1;
		ArrayList<String> lines = new ArrayList<>();
		sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
//			System.out.println(sc.nextLine());
			lines.add(Integer.valueOf(count++).toString() + " " + sc.nextLine());
		}

		for (String line : lines
		) {
			System.out.println(line);
		}
		sc.close();
	}
}


// Java program to read some values using Scanner
// class and print their mean.
//import java.util.Scanner;
//
//public class Solution3
//{
//	public static void main(String[] args)
//	{
//		// Declare an object and initialize with
//		// predefined standard input object
//		Scanner sc = new Scanner(System.in);
//
//		// Initialize sum and count of input elements
//		int sum = 0, count = 0;
//
//		// Check if an int value is available
//		while (sc.hasNextInt())
//		{
//			// Read an int value
//			int num = sc.nextInt();
//			sum += num;
//			count++;
//		}
//		int mean = sum / count;
//		System.out.println("Mean: " + mean);
//	}
//}
