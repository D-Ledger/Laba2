package progect;

import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите число: ");
		int number = in.nextInt();
		
		boolean enteredNumberOne = (number % 5 == 2);
		boolean enteredNumberTwo = (number % 7 == 1);
		
		if (enteredNumberOne && enteredNumberTwo) {
            System.out.println("При делении на 5 остаток равен 2");
            System.out.println("При делении на 7 остаток равен 1");
            System.out.println(number + " удовлетворяет критериям");
		} else {
            if (!enteredNumberOne) {
                System.out.println("Остаток от деления на 5: " + (number % 5));
            }
            if (!enteredNumberTwo) {
                System.out.println("Остаток от деления на 7: " + (number % 7));
            }
            System.out.println(number + " не удовлетворяет критериям");
		}
		in.close();
	}
}
