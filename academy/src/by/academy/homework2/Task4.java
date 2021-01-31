package by.academy.homework2;

import java.util.Random;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		String[] type = { "Червей", "Бубна", "Пик", "Крест" };
		String[] value = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Королева", "Король", "Туз" };
		int count = 5;
		int topCard = 0;
		String[] deck = new String[52];
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("Количество игроков:");
		int n = sc.nextInt();
		for (int i = 0; i < deck.length; i++) {
			deck[i] = value[i % value.length] + " " + type[i % type.length];
		}
		for (int i = 0; i < deck.length; i++) {
			int tmp = rand.nextInt(52);
			String sTmp = deck[i];
			deck[i] = deck[tmp];
			deck[tmp] = sTmp;
		}
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < count; i++) {
				System.out.println(deck[i + topCard]);
			}
			topCard += count;
			System.out.println();
		}
		sc.close();
	}
}