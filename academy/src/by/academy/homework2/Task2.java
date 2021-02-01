package by.academy.homework2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] array;
		int[] symbolCount;
		int numCount = 0;
		int res = 0;

		System.out.println("Введите количество слов:");
		numCount = sc.nextInt();
		array = new String[numCount];
		symbolCount = new int[numCount];
		System.out.println("Введите слова:");
		for (int i = 0; i < numCount; i++) {
			array[i] = sc.next();
		}

		for (int i = 0; i < array.length; i++) {
			symbolCount[i] = array[i].length();
			for (int j = 0; j < array[i].length(); j++) {
				if (j != array[i].indexOf(array[i].charAt(j))) {
					symbolCount[i]--;
				}
			}
		}
		for (int i = 0; i < symbolCount.length; i++) {
			if (symbolCount[i] < symbolCount[res])
				res = i;
		}
		System.out.println("Результат: " + array[res]);
		sc.close();
	}
}