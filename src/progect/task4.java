package progect;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Введите число: ");
		int number = in.nextInt();
		
		if (number >= 5 && number <= 10) {
			System.out.println(number + " попадает в диапазон от 5 до 10 включительно");
		} else {
			if (number < 5) {
				System.out.println(number + " не попадает в диапазон оно меньше 5");
			} else if (number > 10) {
				System.out.println(number + " не попадает в диапазон оно больше 10");
			}
		}
		in.close();
	}
}
