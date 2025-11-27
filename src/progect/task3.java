package progect;

import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		System.out.println("Введите число: ");
		int number = in.nextInt();
		
		boolean enteredNumberOne = (number % 4 == 0);
		boolean enteredNumberTwo = (number > 10);
		
		if (enteredNumberOne && enteredNumberTwo) {
            System.out.println("Делится на 4");
            System.out.println("Не меньше 10");
            System.out.println(number + " удовлетворяет критериям");
		} else {
			if (!enteredNumberOne) {
                System.out.println("Не делится на 4");
            }
            if (!enteredNumberTwo) {
                System.out.println("Меньше 10");
            }
            System.out.println(number + " не удовлетворяет критериям");
		}
		in.close();
	}
}
