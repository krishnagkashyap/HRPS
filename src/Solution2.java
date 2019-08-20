import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer s = null;

		while (sc.hasNext()) {
			s = sc.nextInt();
			break;
			}

		if (s.toString() != null && (s.intValue()>=-100 && s.intValue()<=100)) {
			System.out.println("Good Job");
		} else {
			System.out.println("Wrong answer");

		}
	}
}