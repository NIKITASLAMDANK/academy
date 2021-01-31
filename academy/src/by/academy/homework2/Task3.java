package by.academy.homework2;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String firstWord, secondWord;

		System.out.print("Введите 2 слова: ");
		while (true) {
			firstWord = scanner.nextLine();
			secondWord = scanner.nextLine();

			if (firstWord.length() % 2 == 0 && secondWord.length() % 2 == 0) {
				scanner.close();
				break;
			} else {
				System.out.print("Неверно, введите 2 слова с четным количеством букв: ");
			}
		}

		System.out.println("Результат: " + firstWord.substring(0, firstWord.length() / 2)
				.concat(secondWord.substring(3, secondWord.length() / 1)));
	}
}