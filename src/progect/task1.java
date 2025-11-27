package progect;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите число: ");
		int number = in.nextInt();
		
		if (number % 3 == 0) {
			System.out.println(number + " делится на 3");
		} else {
			System.out.println(number + " не делится на 3");
		}
		in.close();
	}
}
