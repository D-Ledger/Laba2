package progect;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите число: ");
		int number = in.nextInt();
		
		int absNumber = Math.abs(number);
		
		int lastDigit = (absNumber / 1000) % 10;
		
		System.out.println("Четвертая цифра справа в десятичном представлении числа " + number + ": " + lastDigit);

        int totalNumber = absNumber / 1000;
        System.out.println("Всего тысяч в числе: " + totalNumber);
        
        in.close();
	}
}

