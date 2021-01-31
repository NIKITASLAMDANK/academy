package by.academy.homework2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text1;
		String text2;
		int[] compare = new int[256];
		boolean check = true;

		System.out.println("Введите 2 строки для стравнения:");
		text1 = sc.next();
		text2 = sc.next();

		if (text1.length() == text2.length()) {
			for (int i = 0; i < text1.length(); i++) {
				compare[text1.charAt(i)]++;
				compare[text2.charAt(i)]--;
			}
		} else {
			System.out.println("Разная длина строк");
			check = false;
		}
		for (int i = 0; i < compare.length; i++) {
			if (compare[i] != 0) {
				System.out.println("Разные строки");
				check = false;
				break;
			}
		}
		if (check) {
			System.out.println("Строки равны");
		}
		sc.close();
	}
}
