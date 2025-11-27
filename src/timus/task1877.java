package timus;

import java.util.Scanner;

public class task1877 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		
		int firstNumbers = in.nextInt();
		int secondNumbers = in.nextInt();

		if (firstNumbers % 2 == 0 || secondNumbers % 2 != 0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
